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
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal rotaryTableTriggerM = new Signal("rotaryTableTriggerM", Signal.INPUT);
  public Signal alignedSensorM = new Signal("alignedSensorM", Signal.INPUT);
  public Signal capAtPos1M = new Signal("capAtPos1M", Signal.INPUT);
  public Signal bottlePos5M = new Signal("bottlePos5M", Signal.INPUT);
  public Signal jobDone = new Signal("jobDone", Signal.OUTPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal alignedSensor = new Signal("alignedSensor", Signal.OUTPUT);
  public Signal capAtPos1 = new Signal("capAtPos1", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private Signal startTimer_1;
  private Signal stopTimer_1;
  private long __start_thread_10;//sysj\controllerRotaryTable.sysj line: 48, column: 3
  private int S8989 = 1;
  private int S8298 = 1;
  private int S8092 = 1;
  private int S8033 = 1;
  private int S8027 = 1;
  private int S8041 = 1;
  private int S8049 = 1;
  private int S8057 = 1;
  private int S8880 = 1;
  private int S8414 = 1;
  private int S8355 = 1;
  private int S8302 = 1;
  private int S8304 = 1;
  private int S8314 = 1;
  private int S8972 = 1;
  private int S8910 = 1;
  private int S8987 = 1;
  private int S8986 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread9015(int [] tdone, int [] ends){
        switch(S8987){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S8986){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 57, column: 9
              S8986=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 59, column: 7
                selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 60, column: 5
                currsigs.addElement(selectM_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 63, column: 5
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerRotaryTable.sysj line: 59, column: 7
              selectM_1.setPresent();//sysj\controllerRotaryTable.sysj line: 60, column: 5
              currsigs.addElement(selectM_1);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerRotaryTable.sysj line: 63, column: 5
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

  public void thread9014(int [] tdone, int [] ends){
        switch(S8972){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S8910){
          case 0 : 
            if(startTimer_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 49, column: 10
              S8910=1;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\controllerRotaryTable.sysj line: 48, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 48, column: 3
                ends[10]=2;
                ;//sysj\controllerRotaryTable.sysj line: 48, column: 3
                stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 51, column: 4
                currsigs.addElement(stopTimer_1);
                S8910=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 48, column: 3
              ends[10]=2;
              ;//sysj\controllerRotaryTable.sysj line: 48, column: 3
              stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 51, column: 4
              currsigs.addElement(stopTimer_1);
              S8910=2;
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
            S8910=2;
            S8910=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9012(int [] tdone, int [] ends){
        switch(S8314){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 37, column: 24
          S8314=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 39, column: 8
          currsigs.addElement(rotaryTableTrigger);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread9011(int [] tdone, int [] ends){
        switch(S8304){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        S8304=0;
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread9009(int [] tdone, int [] ends){
        S8314=1;
    if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 37, column: 24
      S8314=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      System.out.println("rotaryTableTrigger");//sysj\controllerRotaryTable.sysj line: 38, column: 8
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 39, column: 8
      currsigs.addElement(rotaryTableTrigger);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread9008(int [] tdone, int [] ends){
        S8304=1;
    startTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 34, column: 8
    currsigs.addElement(startTimer_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9007(int [] tdone, int [] ends){
        switch(S8880){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S8414){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 28, column: 9
              S8414=1;
              S8355=0;
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
              S8414=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S8355){
                case 0 : 
                  if(bottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 30, column: 11
                    S8355=1;
                    S8302=0;
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
                  if(capOnBottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 31, column: 12
                    S8414=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    switch(S8302){
                      case 0 : 
                        if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 32, column: 13
                          System.out.println("tableAlignedWithSensor");//sysj\controllerRotaryTable.sysj line: 33, column: 7
                          S8302=1;
                          thread9008(tdone,ends);
                          thread9009(tdone,ends);
                          int biggest9010 = 0;
                          if(ends[8]>=biggest9010){
                            biggest9010=ends[8];
                          }
                          if(ends[9]>=biggest9010){
                            biggest9010=ends[9];
                          }
                          if(biggest9010 == 1){
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
                        thread9011(tdone,ends);
                        thread9012(tdone,ends);
                        int biggest9013 = 0;
                        if(ends[8]>=biggest9013){
                          biggest9013=ends[8];
                        }
                        if(ends[9]>=biggest9013){
                          biggest9013=ends[9];
                        }
                        if(biggest9013 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        //FINXME code
                        if(biggest9013 == 0){
                          S8414=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        break;
                      
                    }
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9005(int [] tdone, int [] ends){
        switch(S8057){
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

  public void thread9004(int [] tdone, int [] ends){
        switch(S8049){
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

  public void thread9003(int [] tdone, int [] ends){
        switch(S8041){
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

  public void thread9002(int [] tdone, int [] ends){
        switch(S8033){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S8027){
          case 0 : 
            S8027=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S8027=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S8027=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S8027=1;
            S8027=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S8027=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S8027=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9000(int [] tdone, int [] ends){
        S8057=1;
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

  public void thread8999(int [] tdone, int [] ends){
        S8049=1;
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

  public void thread8998(int [] tdone, int [] ends){
        S8041=1;
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

  public void thread8997(int [] tdone, int [] ends){
        S8033=1;
    S8027=0;
    if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
      currsigs.addElement(rotaryTableTrigger);
      S8027=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S8027=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread8996(int [] tdone, int [] ends){
        switch(S8298){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S8092){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              S8092=1;
              thread8997(tdone,ends);
              thread8998(tdone,ends);
              thread8999(tdone,ends);
              thread9000(tdone,ends);
              int biggest9001 = 0;
              if(ends[3]>=biggest9001){
                biggest9001=ends[3];
              }
              if(ends[4]>=biggest9001){
                biggest9001=ends[4];
              }
              if(ends[5]>=biggest9001){
                biggest9001=ends[5];
              }
              if(ends[6]>=biggest9001){
                biggest9001=ends[6];
              }
              if(biggest9001 == 1){
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
              S8092=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread9002(tdone,ends);
              thread9003(tdone,ends);
              thread9004(tdone,ends);
              thread9005(tdone,ends);
              int biggest9006 = 0;
              if(ends[3]>=biggest9006){
                biggest9006=ends[3];
              }
              if(ends[4]>=biggest9006){
                biggest9006=ends[4];
              }
              if(ends[5]>=biggest9006){
                biggest9006=ends[5];
              }
              if(ends[6]>=biggest9006){
                biggest9006=ends[6];
              }
              if(biggest9006 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest9006 == 0){
                S8092=0;
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

  public void thread8994(int [] tdone, int [] ends){
        S8987=1;
    S8986=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread8993(int [] tdone, int [] ends){
        S8972=1;
    S8910=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread8992(int [] tdone, int [] ends){
        S8880=1;
    S8414=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread8991(int [] tdone, int [] ends){
        S8298=1;
    S8092=0;
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
      switch(S8989){
        case 0 : 
          S8989=0;
          break RUN;
        
        case 1 : 
          S8989=2;
          S8989=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread8991(tdone,ends);
          thread8992(tdone,ends);
          thread8993(tdone,ends);
          thread8994(tdone,ends);
          int biggest8995 = 0;
          if(ends[2]>=biggest8995){
            biggest8995=ends[2];
          }
          if(ends[7]>=biggest8995){
            biggest8995=ends[7];
          }
          if(ends[10]>=biggest8995){
            biggest8995=ends[10];
          }
          if(ends[11]>=biggest8995){
            biggest8995=ends[11];
          }
          if(biggest8995 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread8996(tdone,ends);
          thread9007(tdone,ends);
          thread9014(tdone,ends);
          thread9015(tdone,ends);
          int biggest9016 = 0;
          if(ends[2]>=biggest9016){
            biggest9016=ends[2];
          }
          if(ends[7]>=biggest9016){
            biggest9016=ends[7];
          }
          if(ends[10]>=biggest9016){
            biggest9016=ends[10];
          }
          if(ends[11]>=biggest9016){
            biggest9016=ends[11];
          }
          if(biggest9016 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9016 == 0){
            S8989=0;
            active[1]=0;
            ends[1]=0;
            S8989=0;
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
          bottleAtPos1.gethook();
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
      bottleAtPos1.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      mode.setpreclear();
      rotaryTableTriggerM.setpreclear();
      alignedSensorM.setpreclear();
      capAtPos1M.setpreclear();
      bottlePos5M.setpreclear();
      jobDone.setpreclear();
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
      jobDone.sethook();
      jobDone.setClear();
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
