/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projet;


/**
 *
 * @author ROOT
 */
public class ChiffreLettre {
            private int chiffre;
        public ChiffreLettre(int chiffre)
        {
            this.chiffre = chiffre;
        }
        public String Transformation()
        {

            int div = (chiffre / 10);

            int unite = chiffre % 10;
            int dizaine = div % 10;

            int div1 = div  / 10;
            int div2 = div1 / 10;
            int centaine = div1 % 10;
            int milieme  = div2;
            
            

            String[] unites    = new String[11];
            String[] dizaines  = new String[21];
            String[] dizaines1 = new String[11];
            String[] centaines = new String[11];
            String[] miliemes = new String[11];

            unites[0] = "";
            unites[1]="Iray";
            unites[2]="Roa";
            unites[3]="Telo";
            unites[4]="Efatra";
            unites[5]="Dimy";
            unites[6]="Enina";
            unites[7]="Fito";
            unites[8]="Valo";
            unites[9]="Sivy";

            dizaines[0] = "";
            dizaines[1] = "Folo";
            dizaines[2] = "Roapolo";
            dizaines[3] = "Telopolo";
            dizaines[4] = "efapolo";
            dizaines[5] = "dimanpolo";
            dizaines[6] = "enimpolo";
            dizaines[7] = "fitopolo";
            dizaines[8] = "valopolo";
            dizaines[9] = "sivyfolo";
            
            dizaines1[0]="";
            dizaines1[1]="Iraika ambin'ny folo";
            dizaines1[2]="Roa ambin'ny folo";
            dizaines1[3]="Telo ambin'ny folo";
            dizaines1[4]="Efatra ambin'ny folo";
            dizaines1[5]="Dimy ambin'ny folo";
            dizaines1[6]="Enina ambin'ny folo";
            dizaines1[7]="Fito ambin'ny folo";
            dizaines1[8]="Valo ambin'ny folo";
            dizaines1[9]="Sivy ambin'ny folo";

            centaines[0] = "";
            centaines[1] = "Zato";
            centaines[2] = "Roanjato";
            centaines[3] = "Telonjato";
            centaines[4] = "Efatrajato";
            centaines[5] = "Dimanjato";
            centaines[6] = "Eninjato";
            centaines[7] = "Fitonjato";
            centaines[8] = "Valonjato";
            centaines[9] = "Sivinjato";

            miliemes[0] = "";
            miliemes[1] = "Arivo";
            miliemes[2] = "Roa";
            miliemes[3] = "Telo";
            miliemes[4] = "Efatra";
            miliemes[5] = "Dimy";
            miliemes[6] = "Enina";
            miliemes[7] = "Fito";
            miliemes[8] = "Valo";
            miliemes[9] = "Sivy";
            
            String chiffreEnLettre = "";
            // milièmes 

            if(div2 != 0 && centaine == 0 && dizaine == 0 && unite == 0) // cas particuliers 1000-9000
            {
               if(div2 == 1)
               {
                  chiffreEnLettre = miliemes[div2];
               }
               else if (div2 != 1)
               {
                  chiffreEnLettre = miliemes[div2]+"-"+"Arivo";
               }
            }   
            else if(div2 != 0 && centaine == 0 && dizaine == 0 && unite != 0) // cas particuliers ?001-?009
            {
               if(div2 == 1)
               {
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+miliemes[div2];
               }
               else if (div2 != 1)
               {
                  chiffreEnLettre = unites[unite]+" sy "+miliemes[div2]+" Arivo ";
               }
            } 
            else if (div2 != 0 && centaine == 0 && dizaine != 0 && unite == 0)  // cas particuliers ??10-??90
            {
               if((div2 == 1 && dizaine == 9) || (div2 == 1 && dizaine == 7) )
               {
                  //chiffreEnLettre = miliemes[div2]+"-"+dizaines[dizaine]+"-"+"dix"+"\n";
                   chiffreEnLettre = dizaines[dizaine]+" sy "+ miliemes[div2];
               }
               else if ((div2 != 1 && dizaine == 9) || (div2 != 1 && dizaine == 7) )
               {
                  chiffreEnLettre = dizaines[dizaine]+" sy "+ miliemes[div2]+" Arivo ";
               } else {
                  if(div2 == 1)
                  {
                   chiffreEnLettre = dizaines[dizaine]+" sy "+ miliemes[div2];
                  }else if (div2 != 1)
                  {
                   chiffreEnLettre = dizaines[dizaine]+" sy "+ miliemes[div2]+" Arivo ";
                  }
               }
            }
            else if(div2 != 0 && centaine == 0 && dizaine == 1 && unite != 0) // cas particuliers ?011-?019
            {
              if(div2 == 1)
               {
                   chiffreEnLettre = dizaines1[unite]+" sy "+miliemes[div2];
               }
               else if (div2 != 1)
               {
                  chiffreEnLettre = dizaines1[unite]+" sy "+miliemes[div2]+" Arivo ";
               }
            } 
            else if(div2 != 0 && centaine ==0 && dizaine !=0 && unite !=0 ) // cas ?0??
            {
               if((div2 == 1 && dizaine == 9) || (div2 == 1 && dizaine == 7))
               {
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+miliemes[div2];
               }else if ((div2 != 1 && dizaine == 9) || (div2 != 1 && dizaine == 7))
               {
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+miliemes[div2]+" Arivo ";
               }else {
                  if(div2 == 1)
                  {
                   chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+miliemes[div2];
                  }else if(div2 != 1)
                  {
                   chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+miliemes[div2]+" Arivo ";  
                  }
               }
            }
            else if(div2 != 0 && centaine !=0 && dizaine == 0 && unite == 0) //?100-?900 
            {
                if(div2 == 1 && centaine == 1)
               {
                  chiffreEnLettre = centaines[centaine]+" sy "+miliemes[div2];
               }
               else if (div2 != 1 && centaine == 1)
               {
                 chiffreEnLettre = centaines[centaine]+" sy "+miliemes[div2]+" Arivo "; 
               }else {
                  if(div2 == 1 && centaine != 1){
                   chiffreEnLettre = centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }else if(div2 != 1 && centaine !=1){
                   chiffreEnLettre = centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }
               }    
            }
            else if(div2 != 0 && centaine != 0 && dizaine == 0 && unite != 0) // cas ??01-??09
            {
               if(div2 == 1 && centaine == 1)
               {
                   chiffreEnLettre = unites[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2] ;
               }
               else if (div2 != 1 && centaine == 1)
               {
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo " ;
               }else {
                  if(div2 == 1 && centaine != 1){
                   chiffreEnLettre = unites[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
                  }else if(div2 != 1 && centaine !=1){
                   chiffreEnLettre = unites[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }
               } 
            }  
            else if(div2 != 0 && centaine != 0 && dizaine != 0 && unite == 0) // ??10 - ??90
            {
               if((div2 == 1 && centaine == 1 && dizaine == 7) || (div2 == 1 && centaine == 1 && dizaine == 9)){
               // chiffreEnLettre = miliemes[div2]+"-"+centaines[centaine]+"-"+dizaines[dizaine]+"-dix"+"\n";
               chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
               }else if((div2 != 1 && centaine == 1 && dizaine == 7) || (div2 != 1 && centaine == 1 && dizaine == 9)){
               chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
               }else if((div2 == 1 && centaine != 1 && dizaine == 7) || (div2 == 1 && centaine != 1 && dizaine == 9)){
               chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
               }else if((div2 != 1 && centaine != 1 && dizaine == 7) || (div2 != 1 && centaine != 1 && dizaine == 9)){
               chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
               }else{
                  if(div2 == 1 && centaine == 1){
                  chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
                  }else if(div2 != 1 && centaine == 1){
                  chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }else if(div2 == 1 && centaine != 1){
                  chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
                  }else if(div2 != 1 && centaine != 1){
                  chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }
               }
            }
            else if(div2 != 0 && centaine != 0 && dizaine != 0 && unite != 0)
            {
               if(div2 == 1 && centaine == 1 && dizaine == 1){
               chiffreEnLettre = dizaines1[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[milieme];
               }else if(div2 == 1 && centaine != 1 && dizaine == 1){
               chiffreEnLettre = dizaines1[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[milieme];
               }else if(div2 != 1 && centaine == 1 && dizaine == 1){
               chiffreEnLettre = dizaines1[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[milieme]+" Arivo ";
               }else if(div2 != 1 && centaine != 1 && dizaine == 1){
               chiffreEnLettre = dizaines1[unite]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[milieme]+" Arivo ";
               }else if((div2 == 1 && centaine == 1 && dizaine == 7) || (div2 == 1 && centaine == 1 && dizaine == 9)){
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
               }else if((div2 == 1 && centaine != 1 && dizaine == 7) || (div2 == 1 && centaine != 1 && dizaine == 9)){
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
               }else if((div2 != 1 && centaine == 1 && dizaine == 7) || (div2 != 1 && centaine == 1 && dizaine == 9)){
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
               }else if((div2 != 1 && centaine != 1 && dizaine == 7) || (div2 != 1 && centaine != 1 && dizaine == 9)){
               chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+ " Arivo ";
               }else{
                  if(div2 == 1 && centaine == 1){
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
                  }else if(div2 == 1 && centaine != 1){
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2];
                  }else if(div2 != 1 && centaine == 1){
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }else if(div2 != 1 && centaine != 1){
                  chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[centaine]+" sy "+miliemes[div2]+" Arivo ";
                  }
               }
            }


            // centaines 

           /* else if ((div1 !=0 && dizaine == 7 && unite !=0) && (div1 !=0 && dizaine == 9 && unite !=0)){
             if(div1 != 1)
             {
               chiffreEnLettre = centaines[div1]+"-"+"cent"+"-"+dizaines[dizaine]+"-"+dizaines1[unite]+"\n";
             }
            } */
            else if ( div == 1 && unite != 0 ) // cas particuliers 11-19
            {
              chiffreEnLettre = dizaines1[unite];
            }  
            else if (div1 != 0 && unite == 0 && dizaine == 0) // cas particuliers 100-900
            {
                if(div1==1) 
                chiffreEnLettre = centaines[div1];    
                else if (div1 != 1)          
                chiffreEnLettre = centaines[div1];

            }else if (div1 !=0 && dizaine == 0 && unite !=0){  // cas particuliers ?01-?09
              if(div1 != 1){
              chiffreEnLettre = unites[unite]+" sy "+centaines[div1];
              }else if(div1 == 1){
              chiffreEnLettre = unites[unite]+"-amin'ny-"+centaines[div1];
              }
            }else if (unite == 0  && dizaine != 0 && div1 == 0 ) // cas particuliers 10 - 90
            {
              if(dizaine == 9 || dizaine == 7)
              {
              chiffreEnLettre = dizaines[dizaine];
              }else {
              chiffreEnLettre = dizaines[dizaine];
              }
            }
            else if (div1 != 0 && dizaine != 0 && unite == 0) // cas particulier ?10-?90
            { 
               if ( (div1 != 1 && dizaine == 9) || (div1 != 1 && dizaine == 7) )
              {
                 chiffreEnLettre = dizaines[dizaine]+" sy "+centaines[div1];
              }else if( (div1 != 1 && dizaine != 9) || (div1 != 1 && dizaine != 7) )
              {
                  chiffreEnLettre = dizaines[dizaine]+" sy "+centaines[div1];
              }
              else if ( (div1 == 1 && dizaine == 9) || (div1 == 1 && dizaine == 7)  )
              {
               chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[div1];
              }else {
              if(div1 != 1){
              chiffreEnLettre = dizaines[dizaine]+" sy "+centaines[div1];
              }else {
              chiffreEnLettre = dizaines[dizaine]+"-amin'ny-"+centaines[div1];
              }
              }
            }
            else if (div1!=0 && dizaine >1 && unite !=0) // cas particuliers ??1-??9
            {
             if((div1 != 1 && dizaine == 9) || (div1 != 1 && dizaine == 7) )
             {
                chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+centaines[div1];
             }else if ((div1 == 1 && dizaine == 9) || (div1 == 1 && dizaine == 7))
             {
                chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[div1];
             }else {
              if(div1 != 1){
              chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+" sy "+centaines[div1];
              }else if (div1 == 1){
              chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine]+"-amin'ny-"+centaines[div1];
              }
             }
            }
            else if (div1 != 0 && dizaine == 1 && unite != 0) // cas particuliers ?11-?19
            {
              if(div1 != 1)
              {
               chiffreEnLettre = dizaines1[unite]+" sy "+centaines[div1];
              }else if (div1 == 1)
              {
               chiffreEnLettre = dizaines1[unite]+"-amin'ny-"+centaines[div1];
              }
            }
            else if (div1 ==0 && dizaine !=0 && unite !=0) // dizaine 
            {
             if(dizaine!=9)
             {
              chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine];
             }
             else if (dizaine == 9)
             {
              chiffreEnLettre = unites[unite]+"-amin'ny-"+dizaines[dizaine];
             }
            }
            else if (div1 == 0 && dizaine == 0 && unite !=0) // unite 
            {
              chiffreEnLettre = unites[unite];  
            }


            if(div2<10)
            return chiffreEnLettre;

            return Transformation();
        }

    
}
