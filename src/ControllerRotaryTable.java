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
  private long __start_thread_6;//sysj\controllerRotaryTable.sysj line: 41, column: 3
  private int S9756 = 1;
  private int S9355 = 1;
  private int S9321 = 1;
  private int S9308 = 1;
  private int S9647 = 1;
  private int S9413 = 1;
  private int S9358 = 1;
  private int S9360 = 1;
  private int S9370 = 1;
  private int S9739 = 1;
  private int S9677 = 1;
  private int S9754 = 1;
  private int S9753 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread9772(int [] tdone, int [] ends){
        switch(S9754){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S9753){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 50, column: 9
              S9753=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 52, column: 7
                selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 53, column: 5
                currsigs.addElement(selectM_1);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 56, column: 5
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 52, column: 7
              selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 53, column: 5
              currsigs.addElement(selectM_1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 56, column: 5
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

  public void thread9771(int [] tdone, int [] ends){
        switch(S9739){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S9677){
          case 0 : 
            if(startTimer_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 42, column: 10
              S9677=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\controllerRotaryTable.sysj line: 41, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 41, column: 3
                ends[6]=2;
                ;//sysj\controllerRotaryTable.sysj line: 41, column: 3
                stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 44, column: 4
                currsigs.addElement(stopTimer_1);
                S9677=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 41, column: 3
              ends[6]=2;
              ;//sysj\controllerRotaryTable.sysj line: 41, column: 3
              stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 44, column: 4
              currsigs.addElement(stopTimer_1);
              S9677=2;
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
            S9677=2;
            S9677=0;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9769(int [] tdone, int [] ends){
        switch(S9370){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 30, column: 23
          S9370=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 32, column: 7
          currsigs.addElement(rotaryTableTrigger);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread9768(int [] tdone, int [] ends){
        switch(S9360){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        S9360=0;
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread9766(int [] tdone, int [] ends){
        S9370=1;
    if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 30, column: 23
      S9370=0;
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
    else {
      System.out.println("rotaryTableTrigger");//sysj\controllerRotaryTable.sysj line: 31, column: 7
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 32, column: 7
      currsigs.addElement(rotaryTableTrigger);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread9765(int [] tdone, int [] ends){
        S9360=1;
    startTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 27, column: 7
    currsigs.addElement(startTimer_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread9764(int [] tdone, int [] ends){
        switch(S9647){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S9413){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 22, column: 9
              S9413=1;
              S9358=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 23, column: 10
              S9413=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              if(capOnBottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 24, column: 11
                S9413=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                switch(S9358){
                  case 0 : 
                    if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 25, column: 12
                      System.out.println("tableAlignedWithSensor");//sysj\controllerRotaryTable.sysj line: 26, column: 6
                      S9358=1;
                      thread9765(tdone,ends);
                      thread9766(tdone,ends);
                      int biggest9767 = 0;
                      if(ends[4]>=biggest9767){
                        biggest9767=ends[4];
                      }
                      if(ends[5]>=biggest9767){
                        biggest9767=ends[5];
                      }
                      if(biggest9767 == 1){
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
                    thread9768(tdone,ends);
                    thread9769(tdone,ends);
                    int biggest9770 = 0;
                    if(ends[4]>=biggest9770){
                      biggest9770=ends[4];
                    }
                    if(ends[5]>=biggest9770){
                      biggest9770=ends[5];
                    }
                    if(biggest9770 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    //FINXME code
                    if(biggest9770 == 0){
                      System.out.println("capOnBottleAtPos1");//sysj\controllerRotaryTable.sysj line: 34, column: 5
                      S9413=0;
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

  public void thread9763(int [] tdone, int [] ends){
        switch(S9355){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9321){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              S9321=1;
              S9308=0;
              if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
                rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
                currsigs.addElement(rotaryTableTrigger);
                S9308=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S9308=1;
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
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 14, column: 10
              S9321=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S9308){
                case 0 : 
                  S9308=0;
                  if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
                    rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
                    currsigs.addElement(rotaryTableTrigger);
                    S9308=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S9308=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S9308=1;
                  S9308=0;
                  if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
                    rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
                    currsigs.addElement(rotaryTableTrigger);
                    S9308=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S9308=1;
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

  public void thread9761(int [] tdone, int [] ends){
        S9754=1;
    S9753=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9760(int [] tdone, int [] ends){
        S9739=1;
    S9677=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread9759(int [] tdone, int [] ends){
        S9647=1;
    S9413=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread9758(int [] tdone, int [] ends){
        S9355=1;
    S9321=0;
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
      switch(S9756){
        case 0 : 
          S9756=0;
          break RUN;
        
        case 1 : 
          S9756=2;
          S9756=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9758(tdone,ends);
          thread9759(tdone,ends);
          thread9760(tdone,ends);
          thread9761(tdone,ends);
          int biggest9762 = 0;
          if(ends[2]>=biggest9762){
            biggest9762=ends[2];
          }
          if(ends[3]>=biggest9762){
            biggest9762=ends[3];
          }
          if(ends[6]>=biggest9762){
            biggest9762=ends[6];
          }
          if(ends[7]>=biggest9762){
            biggest9762=ends[7];
          }
          if(biggest9762 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9763(tdone,ends);
          thread9764(tdone,ends);
          thread9771(tdone,ends);
          thread9772(tdone,ends);
          int biggest9773 = 0;
          if(ends[2]>=biggest9773){
            biggest9773=ends[2];
          }
          if(ends[3]>=biggest9773){
            biggest9773=ends[3];
          }
          if(ends[6]>=biggest9773){
            biggest9773=ends[6];
          }
          if(ends[7]>=biggest9773){
            biggest9773=ends[7];
          }
          if(biggest9773 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9773 == 0){
            S9756=0;
            active[1]=0;
            ends[1]=0;
            S9756=0;
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
