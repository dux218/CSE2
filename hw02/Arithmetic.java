//Duo Xu     2015/1/31
//[CSE2] hw02: Arithmetic Calculations

//put in the price and number  of each item and the sales tax rate and then 
//print out:
  // 1.Total cost of each kind of item; sales tax for that total cost
  // 2.Total cost of purchases (before tax)
  // 3.Total actually paid for this transaction, including sales tax.
  
public class Arithmetic {
     //main method
     public static void main(String[] args){
         
//our input data
  //number and costs per pair of socks
  int nSocks=3;
  double sockCost$=2.58;

  //number and costs per glass
  int nGlasses=6;
  double glassCost$=2.29;

  //number and costs per box of envelopes
  int nEnvelopes=1;
  double envelopeCost$=3.25;

  //tax rates
  double taxPercent=0.06;

//1.print out those inputs
  System.out.println("socks");
  System.out.println("bought "+nSocks+" pairs");
  System.out.println("cost per socks$ ="+sockCost$);
  System.out.println("---------------------------------------");
  
  System.out.println("drinking glasses");
  System.out.println("bought "+nGlasses+" glasses");
  System.out.println("cost per glasses$ ="+glassCost$);
  System.out.println("---------------------------------------");
  
  System.out.println("Envelopes");
  System.out.println("bought "+nEnvelopes+" envelopes");
  System.out.println("cost per envelope$ ="+envelopeCost$);
  System.out.println("---------------------------------------");
  
  System.out.println("                                             ");
  
//2.compute and display the cost of each of item and the sales tax for that item.
   //first define variables for the values needed to print out
   //total cost of socks
   double totalSockCost$;          
   //total tax of socks
   double totalSockTax1$; 
   
   //total cost of glasses
   double totalGlassesCosts$;     
   //total tax of glasses
   double totalGlassesTax1$;        
   //total cost of envelopes
   double totalEnvelopeCosts$;     
   //total tax of envelopes
   double totalEnvelopeTax1$;       
   
   //then compute and print 
   
   //socks
   totalSockCost$=nSocks*sockCost$ ;
   totalSockTax1$=totalSockCost$*taxPercent*100 ;
   int totalSockTax2$= (int) totalSockTax1$;
   double totalSockTax$=totalSockTax2$*0.01;
   
   System.out.println("total cost of socks$ ="+totalSockCost$);
   System.out.println("sales tax for socks$ ="+totalSockTax$);
   System.out.println("------------------------------------------------------------");
   //drinking glasses
   totalGlassesCosts$=nGlasses*glassCost$ ;
   totalGlassesTax1$=totalGlassesCosts$*taxPercent*100;
   int totalGlassesTax2$= (int) totalGlassesTax1$;
   double totalGlassesTax3$=totalGlassesTax2$/100.0;
   int totalGlassesTax4$= (int) (totalGlassesTax3$*100);
   double totalGlassesTax$=totalGlassesTax4$/100.0;
   
   System.out.println("total cost of drinking glasses$ ="+totalGlassesCosts$);
   System.out.println("sales tax for drinking glasses$ ="+totalGlassesTax$);
   System.out.println("------------------------------------------------------------");
   
   //envelope
   totalEnvelopeCosts$=nEnvelopes*envelopeCost$;
   totalEnvelopeTax1$=totalEnvelopeCosts$*taxPercent*100;
   int totalEnvelopeTax2$= (int) totalEnvelopeTax1$;
   double totalEnvelopeTax$=totalEnvelopeTax2$*0.01;
   
   System.out.println("total cost of envelopes$ ="+totalEnvelopeCosts$);
   System.out.println("sales tax for envelopes$ ="+totalEnvelopeTax$);
   System.out.println("------------------------------------------------------------");
   System.out.println("                                                            ");
   
//3.compute and display the total cost of the purchases (before tax), the total sales tax, and the total cost of the purchases (including sales tax). 

   //total cost (before tax)
   double totalCostBeforeTax$=totalSockCost$+totalGlassesCosts$+totalEnvelopeCosts$;
   System.out.println("total cost of the purchases(before tax)$ ="+totalCostBeforeTax$);
   
   //total sales tax
   double totalSalesTax$=totalSockTax$+totalGlassesTax$+totalEnvelopeTax$;
   System.out.println("total sales tax$ ="+totalSalesTax$);
   
   //total cost (after tax)
   double totalCostAfterTax$=totalCostBeforeTax$+totalSalesTax$;
   System.out.println("total cost of the purchases(after tax)$ ="+totalCostAfterTax$);
   
   
   
    
    
   
   
  
  
  
  
     }
}

