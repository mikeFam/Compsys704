import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerRotaryTable extends ClockDomain{
  public ControllerRotaryTable(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal rotaryTableTriggerM = new Signal("rotaryTableTriggerM", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private Signal startTimer_1;
  private Signal stopTimer_1;
  private long __start_thread_6;//sysj\controllerRotaryTable.sysj line: 43, column: 3
  private int S6951 = 1;
  private int S6550 = 1;
  private int S6502 = 1;
  private int S6504 = 1;
  private int S6842 = 1;
  private int S6552 = 1;
  private int S6554 = 1;
  private int S6556 = 1;
  private int S6566 = 1;
  private int S6934 = 1;
  private int S6844 = 1;
  private int S6949 = 1;
  private int S6948 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread6967(int [] tdone, int [] ends){
        switch(S6949){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S6948){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 54, column: 9
              S6948=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 56, column: 7
                selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 57, column: 5
                currsigs.addElement(selectM_1);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 60, column: 5
                currsigs.addElement(selectA_1);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 56, column: 7
              selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 57, column: 5
              currsigs.addElement(selectM_1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 60, column: 5
              currsigs.addElement(selectA_1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6966(int [] tdone, int [] ends){
        switch(S6934){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6844){
          case 0 : 
            if(startTimer_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 44, column: 10
              System.out.println("startTimer");//sysj\controllerRotaryTable.sysj line: 45, column: 4
              S6844=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\controllerRotaryTable.sysj line: 43, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 43, column: 3
                ends[6]=2;
                ;//sysj\controllerRotaryTable.sysj line: 43, column: 3
                stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 47, column: 4
                currsigs.addElement(stopTimer_1);
                System.out.println("stopTimer");//sysj\controllerRotaryTable.sysj line: 48, column: 4
                S6844=2;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 43, column: 3
              ends[6]=2;
              ;//sysj\controllerRotaryTable.sysj line: 43, column: 3
              stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 47, column: 4
              currsigs.addElement(stopTimer_1);
              System.out.println("stopTimer");//sysj\controllerRotaryTable.sysj line: 48, column: 4
              S6844=2;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            S6844=2;
            S6844=0;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6964(int [] tdone, int [] ends){
        switch(S6566){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 32, column: 23
          S6566=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 34, column: 7
          currsigs.addElement(rotaryTableTrigger);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread6963(int [] tdone, int [] ends){
        switch(S6556){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        S6556=0;
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread6961(int [] tdone, int [] ends){
        S6566=1;
    if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 32, column: 23
      S6566=0;
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
    else {
      System.out.println("rotaryTableTrigger");//sysj\controllerRotaryTable.sysj line: 33, column: 7
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 34, column: 7
      currsigs.addElement(rotaryTableTrigger);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread6960(int [] tdone, int [] ends){
        S6556=1;
    startTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 29, column: 7
    currsigs.addElement(startTimer_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread6959(int [] tdone, int [] ends){
        switch(S6842){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S6552){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 23, column: 9
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerRotaryTable.sysj line: 24, column: 3
              S6552=1;
              S6554=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 25, column: 10
              S6552=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              if(capOnBottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 26, column: 11
                S6552=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                switch(S6554){
                  case 0 : 
                    if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 27, column: 12
                      System.out.println("tableAlignedWithSensor");//sysj\controllerRotaryTable.sysj line: 28, column: 6
                      S6554=1;
                      thread6960(tdone,ends);
                      thread6961(tdone,ends);
                      int biggest6962 = 0;
                      if(ends[4]>=biggest6962){
                        biggest6962=ends[4];
                      }
                      if(ends[5]>=biggest6962){
                        biggest6962=ends[5];
                      }
                      if(biggest6962 == 1){
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
                    thread6963(tdone,ends);
                    thread6964(tdone,ends);
                    int biggest6965 = 0;
                    if(ends[4]>=biggest6965){
                      biggest6965=ends[4];
                    }
                    if(ends[5]>=biggest6965){
                      biggest6965=ends[5];
                    }
                    if(biggest6965 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    //FINXME code
                    if(biggest6965 == 0){
                      System.out.println("capOnBottleAtPos1");//sysj\controllerRotaryTable.sysj line: 36, column: 5
                      S6552=0;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6958(int [] tdone, int [] ends){
        switch(S6550){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6502){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerRotaryTable.sysj line: 14, column: 4
              S6502=1;
              S6504=0;
              if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 16, column: 26
                rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 16, column: 47
                currsigs.addElement(rotaryTableTrigger);
                S6504=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S6504=1;
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
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 10
              S6502=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S6504){
                case 0 : 
                  S6504=0;
                  if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 16, column: 26
                    rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 16, column: 47
                    currsigs.addElement(rotaryTableTrigger);
                    S6504=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S6504=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S6504=1;
                  S6504=0;
                  if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 16, column: 26
                    rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 16, column: 47
                    currsigs.addElement(rotaryTableTrigger);
                    S6504=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S6504=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6956(int [] tdone, int [] ends){
        S6949=1;
    S6948=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6955(int [] tdone, int [] ends){
        S6934=1;
    S6844=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6954(int [] tdone, int [] ends){
        S6842=1;
    S6552=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6953(int [] tdone, int [] ends){
        S6550=1;
    S6502=0;
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
      switch(S6951){
        case 0 : 
          S6951=0;
          break RUN;
        
        case 1 : 
          S6951=2;
          S6951=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread6953(tdone,ends);
          thread6954(tdone,ends);
          thread6955(tdone,ends);
          thread6956(tdone,ends);
          int biggest6957 = 0;
          if(ends[2]>=biggest6957){
            biggest6957=ends[2];
          }
          if(ends[3]>=biggest6957){
            biggest6957=ends[3];
          }
          if(ends[6]>=biggest6957){
            biggest6957=ends[6];
          }
          if(ends[7]>=biggest6957){
            biggest6957=ends[7];
          }
          if(biggest6957 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread6958(tdone,ends);
          thread6959(tdone,ends);
          thread6966(tdone,ends);
          thread6967(tdone,ends);
          int biggest6968 = 0;
          if(ends[2]>=biggest6968){
            biggest6968=ends[2];
          }
          if(ends[3]>=biggest6968){
            biggest6968=ends[3];
          }
          if(ends[6]>=biggest6968){
            biggest6968=ends[6];
          }
          if(ends[7]>=biggest6968){
            biggest6968=ends[7];
          }
          if(biggest6968 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6968 == 0){
            S6951=0;
            active[1]=0;
            ends[1]=0;
            S6951=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    selectM_1 = new Signal();
    selectA_1 = new Signal();
    startTimer_1 = new Signal();
    stopTimer_1 = new Signal();
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
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          mode.gethook();
          rotaryTableTriggerM.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      mode.setpreclear();
      rotaryTableTriggerM.setpreclear();
      rotaryTableTrigger.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      startTimer_1.setpreclear();
      stopTimer_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = rotaryTableTriggerM.getStatus() ? rotaryTableTriggerM.setprepresent() : rotaryTableTriggerM.setpreclear();
      rotaryTableTriggerM.setpreval(rotaryTableTriggerM.getValue());
      rotaryTableTriggerM.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      startTimer_1.setClear();
      stopTimer_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        mode.gethook();
        rotaryTableTriggerM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
