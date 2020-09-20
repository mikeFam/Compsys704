import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerMain extends ClockDomain{
  public ControllerMain(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal jobDoneConveyor = new Signal("jobDoneConveyor", Signal.INPUT);
  public Signal jobDoneRotary = new Signal("jobDoneRotary", Signal.INPUT);
  public Signal jobDoneFiller = new Signal("jobDoneFiller", Signal.INPUT);
  public Signal jobDoneCapper = new Signal("jobDoneCapper", Signal.INPUT);
  public Signal jobDoneCapLoader = new Signal("jobDoneCapLoader", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal enableCapLoader = new Signal("enableCapLoader", Signal.OUTPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.OUTPUT);
  public Signal enableCapper = new Signal("enableCapper", Signal.OUTPUT);
  private int S7935 = 1;
  private int S7785 = 1;
  private int S7729 = 1;
  private int S7859 = 1;
  private int S7803 = 1;
  private int S7933 = 1;
  private int S7877 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread7943(int [] tdone, int [] ends){
        switch(S7933){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7877){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj\controllerMain.sysj line: 31, column: 10
              S7877=1;
              if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 32, column: 20
                S7877=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("bottleAtPos4");//sysj\controllerMain.sysj line: 33, column: 5
                enableCapper.setPresent();//sysj\controllerMain.sysj line: 34, column: 5
                currsigs.addElement(enableCapper);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 32, column: 20
              S7877=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              enableCapper.setPresent();//sysj\controllerMain.sysj line: 34, column: 5
              currsigs.addElement(enableCapper);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7942(int [] tdone, int [] ends){
        switch(S7859){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7803){
          case 0 : 
            if(bottleAtPos3.getprestatus()){//sysj\controllerMain.sysj line: 21, column: 10
              S7803=1;
              if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 22, column: 20
                S7803=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                System.out.println("bottleAtPos3");//sysj\controllerMain.sysj line: 23, column: 5
                enableCapLoader.setPresent();//sysj\controllerMain.sysj line: 24, column: 5
                currsigs.addElement(enableCapLoader);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 22, column: 20
              S7803=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              enableCapLoader.setPresent();//sysj\controllerMain.sysj line: 24, column: 5
              currsigs.addElement(enableCapLoader);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7941(int [] tdone, int [] ends){
        switch(S7785){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7729){
          case 0 : 
            if(bottleAtPos2.getprestatus()){//sysj\controllerMain.sysj line: 11, column: 10
              S7729=1;
              if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 12, column: 20
                S7729=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("bottleAtPos2");//sysj\controllerMain.sysj line: 13, column: 5
                enableFiller.setPresent();//sysj\controllerMain.sysj line: 14, column: 5
                currsigs.addElement(enableFiller);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 12, column: 20
              S7729=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              enableFiller.setPresent();//sysj\controllerMain.sysj line: 14, column: 5
              currsigs.addElement(enableFiller);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7939(int [] tdone, int [] ends){
        S7933=1;
    S7877=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread7938(int [] tdone, int [] ends){
        S7859=1;
    S7803=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread7937(int [] tdone, int [] ends){
        S7785=1;
    S7729=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S7935){
        case 0 : 
          S7935=0;
          break RUN;
        
        case 1 : 
          S7935=2;
          S7935=2;
          thread7937(tdone,ends);
          thread7938(tdone,ends);
          thread7939(tdone,ends);
          int biggest7940 = 0;
          if(ends[2]>=biggest7940){
            biggest7940=ends[2];
          }
          if(ends[3]>=biggest7940){
            biggest7940=ends[3];
          }
          if(ends[4]>=biggest7940){
            biggest7940=ends[4];
          }
          if(biggest7940 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread7941(tdone,ends);
          thread7942(tdone,ends);
          thread7943(tdone,ends);
          int biggest7944 = 0;
          if(ends[2]>=biggest7944){
            biggest7944=ends[2];
          }
          if(ends[3]>=biggest7944){
            biggest7944=ends[3];
          }
          if(ends[4]>=biggest7944){
            biggest7944=ends[4];
          }
          if(biggest7944 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7944 == 0){
            S7935=0;
            active[1]=0;
            ends[1]=0;
            S7935=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          jobDoneConveyor.gethook();
          jobDoneRotary.gethook();
          jobDoneFiller.gethook();
          jobDoneCapper.gethook();
          jobDoneCapLoader.gethook();
          enable.gethook();
          bottleAtLoad.gethook();
          bottleAtPos1.gethook();
          bottleAtPos2.gethook();
          bottleAtPos3.gethook();
          bottleAtPos4.gethook();
          bottleAtPos5.gethook();
          bottleLeftPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      jobDoneConveyor.setpreclear();
      jobDoneRotary.setpreclear();
      jobDoneFiller.setpreclear();
      jobDoneCapper.setpreclear();
      jobDoneCapLoader.setpreclear();
      enable.setpreclear();
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      enableCapLoader.setpreclear();
      enableFiller.setpreclear();
      enableCapper.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = jobDoneConveyor.getStatus() ? jobDoneConveyor.setprepresent() : jobDoneConveyor.setpreclear();
      jobDoneConveyor.setpreval(jobDoneConveyor.getValue());
      jobDoneConveyor.setClear();
      dummyint = jobDoneRotary.getStatus() ? jobDoneRotary.setprepresent() : jobDoneRotary.setpreclear();
      jobDoneRotary.setpreval(jobDoneRotary.getValue());
      jobDoneRotary.setClear();
      dummyint = jobDoneFiller.getStatus() ? jobDoneFiller.setprepresent() : jobDoneFiller.setpreclear();
      jobDoneFiller.setpreval(jobDoneFiller.getValue());
      jobDoneFiller.setClear();
      dummyint = jobDoneCapper.getStatus() ? jobDoneCapper.setprepresent() : jobDoneCapper.setpreclear();
      jobDoneCapper.setpreval(jobDoneCapper.getValue());
      jobDoneCapper.setClear();
      dummyint = jobDoneCapLoader.getStatus() ? jobDoneCapLoader.setprepresent() : jobDoneCapLoader.setpreclear();
      jobDoneCapLoader.setpreval(jobDoneCapLoader.getValue());
      jobDoneCapLoader.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = bottleAtLoad.getStatus() ? bottleAtLoad.setprepresent() : bottleAtLoad.setpreclear();
      bottleAtLoad.setpreval(bottleAtLoad.getValue());
      bottleAtLoad.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      enableCapLoader.sethook();
      enableCapLoader.setClear();
      enableFiller.sethook();
      enableFiller.setClear();
      enableCapper.sethook();
      enableCapper.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        jobDoneConveyor.gethook();
        jobDoneRotary.gethook();
        jobDoneFiller.gethook();
        jobDoneCapper.gethook();
        jobDoneCapLoader.gethook();
        enable.gethook();
        bottleAtLoad.gethook();
        bottleAtPos1.gethook();
        bottleAtPos2.gethook();
        bottleAtPos3.gethook();
        bottleAtPos4.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
