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
  private long __start_thread_10;//sysj\controllerRotaryTable.sysj line: 47, column: 3
  private int S9980 = 1;
  private int S9579 = 1;
  private int S9373 = 1;
  private int S9314 = 1;
  private int S9308 = 1;
  private int S9322 = 1;
  private int S9330 = 1;
  private int S9338 = 1;
  private int S9871 = 1;
  private int S9637 = 1;
  private int S9582 = 1;
  private int S9584 = 1;
  private int S9594 = 1;
  private int S9963 = 1;
  private int S9901 = 1;
  private int S9978 = 1;
  private int S9977 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread10006(int [] tdone, int [] ends){
        switch(S9978){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S9977){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 56, column: 9
              S9977=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 58, column: 7
                selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 59, column: 5
                currsigs.addElement(selectM_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 62, column: 5
                currsigs.addElement(selectA_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 58, column: 7
              selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 59, column: 5
              currsigs.addElement(selectM_1);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 62, column: 5
              currsigs.addElement(selectA_1);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10005(int [] tdone, int [] ends){
        switch(S9963){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S9901){
          case 0 : 
            if(startTimer_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 48, column: 10
              S9901=1;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\controllerRotaryTable.sysj line: 47, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 47, column: 3
                ends[10]=2;
                ;//sysj\controllerRotaryTable.sysj line: 47, column: 3
                stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 50, column: 4
                currsigs.addElement(stopTimer_1);
                S9901=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
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
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 47, column: 3
              ends[10]=2;
              ;//sysj\controllerRotaryTable.sysj line: 47, column: 3
              stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 50, column: 4
              currsigs.addElement(stopTimer_1);
              S9901=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S9901=2;
            S9901=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10003(int [] tdone, int [] ends){
        switch(S9594){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 36, column: 23
          S9594=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 38, column: 7
          currsigs.addElement(rotaryTableTrigger);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread10002(int [] tdone, int [] ends){
        switch(S9584){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        S9584=0;
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread10000(int [] tdone, int [] ends){
        S9594=1;
    if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 36, column: 23
      S9594=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      System.out.println("rotaryTableTrigger");//sysj\controllerRotaryTable.sysj line: 37, column: 7
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 38, column: 7
      currsigs.addElement(rotaryTableTrigger);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread9999(int [] tdone, int [] ends){
        S9584=1;
    startTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 33, column: 7
    currsigs.addElement(startTimer_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9998(int [] tdone, int [] ends){
        switch(S9871){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S9637){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 28, column: 9
              S9637=1;
              S9582=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 29, column: 10
              S9637=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              if(capOnBottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 30, column: 11
                S9637=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                switch(S9582){
                  case 0 : 
                    if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 31, column: 12
                      System.out.println("tableAlignedWithSensor");//sysj\controllerRotaryTable.sysj line: 32, column: 6
                      S9582=1;
                      thread9999(tdone,ends);
                      thread10000(tdone,ends);
                      int biggest10001 = 0;
                      if(ends[8]>=biggest10001){
                        biggest10001=ends[8];
                      }
                      if(ends[9]>=biggest10001){
                        biggest10001=ends[9];
                      }
                      if(biggest10001 == 1){
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
                    thread10002(tdone,ends);
                    thread10003(tdone,ends);
                    int biggest10004 = 0;
                    if(ends[8]>=biggest10004){
                      biggest10004=ends[8];
                    }
                    if(ends[9]>=biggest10004){
                      biggest10004=ends[9];
                    }
                    if(biggest10004 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest10004 == 0){
                      System.out.println("capOnBottleAtPos1");//sysj\controllerRotaryTable.sysj line: 40, column: 5
                      S9637=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
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

  public void thread9996(int [] tdone, int [] ends){
        switch(S9338){
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

  public void thread9995(int [] tdone, int [] ends){
        switch(S9330){
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

  public void thread9994(int [] tdone, int [] ends){
        switch(S9322){
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

  public void thread9993(int [] tdone, int [] ends){
        switch(S9314){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S9308){
          case 0 : 
            S9308=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S9308=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S9308=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S9308=1;
            S9308=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S9308=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S9308=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9991(int [] tdone, int [] ends){
        S9338=1;
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

  public void thread9990(int [] tdone, int [] ends){
        S9330=1;
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

  public void thread9989(int [] tdone, int [] ends){
        S9322=1;
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

  public void thread9988(int [] tdone, int [] ends){
        S9314=1;
    S9308=0;
    if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
      currsigs.addElement(rotaryTableTrigger);
      S9308=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S9308=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread9987(int [] tdone, int [] ends){
        switch(S9579){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9373){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              S9373=1;
              thread9988(tdone,ends);
              thread9989(tdone,ends);
              thread9990(tdone,ends);
              thread9991(tdone,ends);
              int biggest9992 = 0;
              if(ends[3]>=biggest9992){
                biggest9992=ends[3];
              }
              if(ends[4]>=biggest9992){
                biggest9992=ends[4];
              }
              if(ends[5]>=biggest9992){
                biggest9992=ends[5];
              }
              if(ends[6]>=biggest9992){
                biggest9992=ends[6];
              }
              if(biggest9992 == 1){
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
              S9373=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread9993(tdone,ends);
              thread9994(tdone,ends);
              thread9995(tdone,ends);
              thread9996(tdone,ends);
              int biggest9997 = 0;
              if(ends[3]>=biggest9997){
                biggest9997=ends[3];
              }
              if(ends[4]>=biggest9997){
                biggest9997=ends[4];
              }
              if(ends[5]>=biggest9997){
                biggest9997=ends[5];
              }
              if(ends[6]>=biggest9997){
                biggest9997=ends[6];
              }
              if(biggest9997 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest9997 == 0){
                S9373=0;
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

  public void thread9985(int [] tdone, int [] ends){
        S9978=1;
    S9977=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9984(int [] tdone, int [] ends){
        S9963=1;
    S9901=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9983(int [] tdone, int [] ends){
        S9871=1;
    S9637=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9982(int [] tdone, int [] ends){
        S9579=1;
    S9373=0;
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
      switch(S9980){
        case 0 : 
          S9980=0;
          break RUN;
        
        case 1 : 
          S9980=2;
          S9980=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9982(tdone,ends);
          thread9983(tdone,ends);
          thread9984(tdone,ends);
          thread9985(tdone,ends);
          int biggest9986 = 0;
          if(ends[2]>=biggest9986){
            biggest9986=ends[2];
          }
          if(ends[7]>=biggest9986){
            biggest9986=ends[7];
          }
          if(ends[10]>=biggest9986){
            biggest9986=ends[10];
          }
          if(ends[11]>=biggest9986){
            biggest9986=ends[11];
          }
          if(biggest9986 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread9987(tdone,ends);
          thread9998(tdone,ends);
          thread10005(tdone,ends);
          thread10006(tdone,ends);
          int biggest10007 = 0;
          if(ends[2]>=biggest10007){
            biggest10007=ends[2];
          }
          if(ends[7]>=biggest10007){
            biggest10007=ends[7];
          }
          if(ends[10]>=biggest10007){
            biggest10007=ends[10];
          }
          if(ends[11]>=biggest10007){
            biggest10007=ends[11];
          }
          if(biggest10007 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10007 == 0){
            S9980=0;
            active[1]=0;
            ends[1]=0;
            S9980=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          alignedSensorM.gethook();
          capAtPos1M.gethook();
          bottlePos5M.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
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
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
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
