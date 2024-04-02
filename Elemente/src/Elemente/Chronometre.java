package Elemente;

public class Chronometre {

    long debut;
      
      public Chronometre()
      {
    	  
      }
      
      public void start()
      {
          debut = System.nanoTime()/1000;
      }
      
      public long stop()
      {
          return System.nanoTime()/1000- debut;
      }
      
      
  }