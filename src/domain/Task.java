package domain;

    interface Task {
    
   Boolean start();
   Boolean cancel();
   Long runningTime = null;
   
}
