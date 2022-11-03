public class totalObjects
{

   private static int numObjects = 0;
// Creating singleton class private instance to remove Common Coupling 
   private totalObjects()
   {
      numObjects=0;
   }

   public static void objectAdded()
   {
      numObjects++;
   }

   public static int getTotalObjects()
   {
      return numObjects;
   }




}