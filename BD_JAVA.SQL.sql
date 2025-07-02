DROP DATABASE IF EXISTS MLR1;

CREATE DATABASE IF NOT EXISTS MLR1;
USE MLR1;
# -----------------------------------------------------------------------------
#       TABLE : ENFANT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ENFANT
 (
   ID_ENFANT INTEGER(10) NOT NULL   ,
   ID_PARENT INTEGER(10) NOT NULL  ,
   NOM VARCHAR(200) NOT NULL  ,
   PRENOM VARCHAR(200) NOT NULL  ,
   DATE_NAISSANCE VARCHAR(200) NOT NULL  ,
   HEURE_NAISSANCE VARCHAR(200) NOT NULL  ,
   SITUATION_NAISSANCE VARCHAR(200) NOT NULL  ,
   DISTRICT VARCHAR(100) NOT NULL  ,
   SEXE VARCHAR(50) NOT NULL ,
   LIEU_NAISSANCE VARCHAR (100) NOT NULL
   , PRIMARY KEY (ID_ENFANT) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE ENFANT
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_ENFANT_PARENT
     ON ENFANT (ID_PARENT ASC);

# -----------------------------------------------------------------------------
#       TABLE : PARENT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PARENT
 (
   ID_PARENT INTEGER(10) NOT NULL  ,
   NOM_PERE VARCHAR(200) NOT NULL  ,
   PRENOM_PERE VARCHAR(200) NOT NULL  ,
   DATE_NAISSANCE_PERE VARCHAR(200) NOT NULL  ,
   LIEU_NAISSANCE_PERE VARCHAR(200) NOT NULL  ,
   PROFESSION_PERE VARCHAR(200) NOT NULL  ,
   NOM_MERE VARCHAR(200) NOT NULL  ,
   PRENOM_MERE VARCHAR(200) NOT NULL  ,
   DATE_NAISSANCE_MERE VARCHAR(200) NOT NULL  ,
   LIEU_NAISSANCE_MERE VARCHAR(200) NOT NULL  ,
   PROFESSION_MERE VARCHAR(200) NOT NULL  ,
   RESIDENCE VARCHAR(200) NOT NULL  
   , PRIMARY KEY (ID_PARENT) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : KOPIA
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS KOPIA
 (
   REF INTEGER(10) NOT NULL ,
   ID_ENFANT INTEGER(10) NOT NULL  ,
   DATE_CREATION VARCHAR(200) NOT NULL  ,
   HEURE_CREATION VARCHAR(200) NOT NULL  ,
   SITUATION_CREATION VARCHAR(200) NOT NULL  ,
   LIEU_CREATION VARCHAR(200) NOT NULL  ,
   RESPONSABLE CHAR(200) NOT NULL  
   , PRIMARY KEY (REF)  
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE KOPIA
# -----------------------------------------------------------------------------


CREATE UNIQUE INDEX I_FK_KOPIA_ENFANT
     ON KOPIA (ID_ENFANT ASC);


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE ENFANT 
  ADD FOREIGN KEY FK_ENFANT_PARENT (ID_PARENT)
      REFERENCES PARENT (ID_PARENT) ;


ALTER TABLE KOPIA 
  ADD FOREIGN KEY FK_KOPIA_ENFANT (ID_ENFANT)
      REFERENCES ENFANT (ID_ENFANT) ;

