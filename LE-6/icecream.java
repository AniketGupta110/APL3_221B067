 class icecream extends Decorator
{
   icecream(Offering offering)
   {this.offering=offering; 
   }
   String getName()
   {
      return offering.getName()+" with icecream";
   }
   int getPrice()
   {
       return offering.getPrice()+10;
   }
        
        
      
}
