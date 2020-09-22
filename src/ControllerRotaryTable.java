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
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal enableRotaryTable = new Signal("enableRotaryTable", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal rotaryTableTriggerM = new Signal("rotaryTableTriggerM", Signal.INPUT);
  public Signal alignedSensorM = new Signal("alignedSensorM", Signal.INPUT);
  public Signal capAtPos1M = new Signal("capAtPos1M", Signal.INPUT);
  public Signal bottlePos5M = new Signal("bottlePos5M", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal alignedSensor = new Signal("alignedSensor", Signal.OUTPUT);
  public Signal capAtPos1 = new Signal("capAtPos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private Signal startTimer_1;
  private Signal stopTimer_1;
  private int S9382 = 1;
  private int S9083 = 1;
  private int S8877 = 1;
  private int S8818 = 1;
  private int S8812 = 1;
  private int S8826 = 1;
  private int S8834 = 1;
  private int S8842 = 1;
  private int S9365 = 1;
  private int S9153 = 1;
  private int S9105 = 1;
  private int S9104 = 1;
  private int S9093 = 1;
  private int S9117 = 1;
  private int S9108 = 1;
  private int S9380 = 1;
  private int S9379 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread9406(int [] tdone, int [] ends){
        switch(S9380){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S9379){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 51, column: 9
              S9379=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 53, column: 7
                selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 54, column: 5
                currsigs.addElement(selectM_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 57, column: 5
                currsigs.addElement(selectA_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 53, column: 7
              selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 54, column: 5
              currsigs.addElement(selectM_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 57, column: 5
              currsigs.addElement(selectA_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9404(int [] tdone, int [] ends){
        switch(S9117){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S9108){
          case 0 : 
            if(enableRotaryTable.getprestatus()){//sysj\controllerRotaryTable.sysj line: 40, column: 12
              System.out.println("hi1");//sysj\controllerRotaryTable.sysj line: 41, column: 6
              S9108=1;
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 43, column: 7
              currsigs.addElement(rotaryTableTrigger);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(!enableRotaryTable.getprestatus()){//sysj\controllerRotaryTable.sysj line: 42, column: 12
              S9117=0;
              active[9]=0;
              ends[9]=0;
              tdone[9]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 43, column: 7
              currsigs.addElement(rotaryTableTrigger);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9403(int [] tdone, int [] ends){
        switch(S9105){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S9104){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 31, column: 12
              S9104=1;
              S9093=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(capOnBottleAtPos1.getprestatus() || !bottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 32, column: 12
              S9105=0;
              active[8]=0;
              ends[8]=0;
              tdone[8]=1;
            }
            else {
              switch(S9093){
                case 0 : 
                  if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 33, column: 13
                    S9093=1;
                    rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 34, column: 7
                    currsigs.addElement(rotaryTableTrigger);
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
                case 1 : 
                  rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 34, column: 7
                  currsigs.addElement(rotaryTableTrigger);
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9401(int [] tdone, int [] ends){
        S9117=1;
    System.out.println("hi");//sysj\controllerRotaryTable.sysj line: 39, column: 6
    S9108=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread9400(int [] tdone, int [] ends){
        S9105=1;
    S9104=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9399(int [] tdone, int [] ends){
        switch(S9365){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S9153){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 28, column: 9
              S9153=1;
              thread9400(tdone,ends);
              thread9401(tdone,ends);
              int biggest9402 = 0;
              if(ends[8]>=biggest9402){
                biggest9402=ends[8];
              }
              if(ends[9]>=biggest9402){
                biggest9402=ends[9];
              }
              if(biggest9402 == 1){
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
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 29, column: 10
              S9153=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              thread9403(tdone,ends);
              thread9404(tdone,ends);
              int biggest9405 = 0;
              if(ends[8]>=biggest9405){
                biggest9405=ends[8];
              }
              if(ends[9]>=biggest9405){
                biggest9405=ends[9];
              }
              if(biggest9405 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              //FINXME code
              if(biggest9405 == 0){
                S9153=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9397(int [] tdone, int [] ends){
        switch(S8842){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottlePos5M.getprestatus()){//sysj\controllerRotaryTable.sysj line: 21, column: 26
          bottlePos5.setPresent();//sysj\controllerRotaryTable.sysj line: 21, column: 39
          currsigs.addElement(bottlePos5);
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
      
    }
  }

  public void thread9396(int [] tdone, int [] ends){
        switch(S8834){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(capAtPos1M.getprestatus()){//sysj\controllerRotaryTable.sysj line: 19, column: 26
          capAtPos1.setPresent();//sysj\controllerRotaryTable.sysj line: 19, column: 38
          currsigs.addElement(capAtPos1);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread9395(int [] tdone, int [] ends){
        switch(S8826){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(alignedSensorM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 17, column: 26
          alignedSensor.setPresent();//sysj\controllerRotaryTable.sysj line: 17, column: 42
          currsigs.addElement(alignedSensor);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread9394(int [] tdone, int [] ends){
        switch(S8818){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S8812){
          case 0 : 
            S8812=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S8812=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S8812=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S8812=1;
            S8812=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S8812=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S8812=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9392(int [] tdone, int [] ends){
        S8842=1;
    if(bottlePos5M.getprestatus()){//sysj\controllerRotaryTable.sysj line: 21, column: 26
      bottlePos5.setPresent();//sysj\controllerRotaryTable.sysj line: 21, column: 39
      currsigs.addElement(bottlePos5);
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

  public void thread9391(int [] tdone, int [] ends){
        S8834=1;
    if(capAtPos1M.getprestatus()){//sysj\controllerRotaryTable.sysj line: 19, column: 26
      capAtPos1.setPresent();//sysj\controllerRotaryTable.sysj line: 19, column: 38
      currsigs.addElement(capAtPos1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread9390(int [] tdone, int [] ends){
        S8826=1;
    if(alignedSensorM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 17, column: 26
      alignedSensor.setPresent();//sysj\controllerRotaryTable.sysj line: 17, column: 42
      currsigs.addElement(alignedSensor);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread9389(int [] tdone, int [] ends){
        S8818=1;
    S8812=0;
    if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
      currsigs.addElement(rotaryTableTrigger);
      S8812=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S8812=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread9388(int [] tdone, int [] ends){
        switch(S9083){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S8877){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              S8877=1;
              thread9389(tdone,ends);
              thread9390(tdone,ends);
              thread9391(tdone,ends);
              thread9392(tdone,ends);
              int biggest9393 = 0;
              if(ends[3]>=biggest9393){
                biggest9393=ends[3];
              }
              if(ends[4]>=biggest9393){
                biggest9393=ends[4];
              }
              if(ends[5]>=biggest9393){
                biggest9393=ends[5];
              }
              if(ends[6]>=biggest9393){
                biggest9393=ends[6];
              }
              if(biggest9393 == 1){
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
              S8877=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread9394(tdone,ends);
              thread9395(tdone,ends);
              thread9396(tdone,ends);
              thread9397(tdone,ends);
              int biggest9398 = 0;
              if(ends[3]>=biggest9398){
                biggest9398=ends[3];
              }
              if(ends[4]>=biggest9398){
                biggest9398=ends[4];
              }
              if(ends[5]>=biggest9398){
                biggest9398=ends[5];
              }
              if(ends[6]>=biggest9398){
                biggest9398=ends[6];
              }
              if(biggest9398 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest9398 == 0){
                S8877=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9386(int [] tdone, int [] ends){
        S9380=1;
    S9379=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9385(int [] tdone, int [] ends){
        S9365=1;
    S9153=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9384(int [] tdone, int [] ends){
        S9083=1;
    S8877=0;
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
      switch(S9382){
        case 0 : 
          S9382=0;
          break RUN;
        
        case 1 : 
          S9382=2;
          S9382=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9384(tdone,ends);
          thread9385(tdone,ends);
          thread9386(tdone,ends);
          int biggest9387 = 0;
          if(ends[2]>=biggest9387){
            biggest9387=ends[2];
          }
          if(ends[7]>=biggest9387){
            biggest9387=ends[7];
          }
          if(ends[10]>=biggest9387){
            biggest9387=ends[10];
          }
          if(biggest9387 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9388(tdone,ends);
          thread9399(tdone,ends);
          thread9406(tdone,ends);
          int biggest9407 = 0;
          if(ends[2]>=biggest9407){
            biggest9407=ends[2];
          }
          if(ends[7]>=biggest9407){
            biggest9407=ends[7];
          }
          if(ends[10]>=biggest9407){
            biggest9407=ends[10];
          }
          if(biggest9407 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9407 == 0){
            S9382=0;
            active[1]=0;
            ends[1]=0;
            S9382=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos1.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          enableRotaryTable.gethook();
          mode.gethook();
          rotaryTableTriggerM.gethook();
          alignedSensorM.gethook();
          capAtPos1M.gethook();
          bottlePos5M.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      enableRotaryTable.setpreclear();
      mode.setpreclear();
      rotaryTableTriggerM.setpreclear();
      alignedSensorM.setpreclear();
      capAtPos1M.setpreclear();
      bottlePos5M.setpreclear();
      rotaryTableTrigger.setpreclear();
      alignedSensor.setpreclear();
      capAtPos1.setpreclear();
      bottlePos5.setpreclear();
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
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = enableRotaryTable.getStatus() ? enableRotaryTable.setprepresent() : enableRotaryTable.setpreclear();
      enableRotaryTable.setpreval(enableRotaryTable.getValue());
      enableRotaryTable.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = rotaryTableTriggerM.getStatus() ? rotaryTableTriggerM.setprepresent() : rotaryTableTriggerM.setpreclear();
      rotaryTableTriggerM.setpreval(rotaryTableTriggerM.getValue());
      rotaryTableTriggerM.setClear();
      dummyint = alignedSensorM.getStatus() ? alignedSensorM.setprepresent() : alignedSensorM.setpreclear();
      alignedSensorM.setpreval(alignedSensorM.getValue());
      alignedSensorM.setClear();
      dummyint = capAtPos1M.getStatus() ? capAtPos1M.setprepresent() : capAtPos1M.setpreclear();
      capAtPos1M.setpreval(capAtPos1M.getValue());
      capAtPos1M.setClear();
      dummyint = bottlePos5M.getStatus() ? bottlePos5M.setprepresent() : bottlePos5M.setpreclear();
      bottlePos5M.setpreval(bottlePos5M.getValue());
      bottlePos5M.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      alignedSensor.sethook();
      alignedSensor.setClear();
      capAtPos1.sethook();
      capAtPos1.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      startTimer_1.setClear();
      stopTimer_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        enableRotaryTable.gethook();
        mode.gethook();
        rotaryTableTriggerM.gethook();
        alignedSensorM.gethook();
        capAtPos1M.gethook();
        bottlePos5M.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
