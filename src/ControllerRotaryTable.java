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
  private int S8623 = 1;
  private int S8222 = 1;
  private int S8016 = 1;
  private int S7957 = 1;
  private int S7951 = 1;
  private int S7965 = 1;
  private int S7973 = 1;
  private int S7981 = 1;
  private int S8514 = 1;
  private int S8280 = 1;
  private int S8225 = 1;
  private int S8227 = 1;
  private int S8237 = 1;
  private int S8606 = 1;
  private int S8544 = 1;
  private int S8621 = 1;
  private int S8620 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread8649(int [] tdone, int [] ends){
        switch(S8621){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S8620){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerRotaryTable.sysj line: 56, column: 9
              S8620=1;
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

  public void thread8648(int [] tdone, int [] ends){
        switch(S8606){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S8544){
          case 0 : 
            if(startTimer_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 48, column: 10
              S8544=1;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\controllerRotaryTable.sysj line: 47, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\controllerRotaryTable.sysj line: 47, column: 3
                ends[10]=2;
                ;//sysj\controllerRotaryTable.sysj line: 47, column: 3
                stopTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 50, column: 4
                currsigs.addElement(stopTimer_1);
                S8544=2;
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
              S8544=2;
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
            S8544=2;
            S8544=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread8646(int [] tdone, int [] ends){
        switch(S8237){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 36, column: 23
          S8237=0;
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

  public void thread8645(int [] tdone, int [] ends){
        switch(S8227){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        S8227=0;
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread8643(int [] tdone, int [] ends){
        S8237=1;
    if((stopTimer_1.getprestatus() && tableAlignedWithSensor.getprestatus())){//sysj\controllerRotaryTable.sysj line: 36, column: 23
      S8237=0;
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

  public void thread8642(int [] tdone, int [] ends){
        S8227=1;
    startTimer_1.setPresent();//sysj\controllerRotaryTable.sysj line: 33, column: 7
    currsigs.addElement(startTimer_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread8641(int [] tdone, int [] ends){
        switch(S8514){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S8280){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 28, column: 9
              S8280=1;
              S8225=0;
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
              S8280=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              if(capOnBottleAtPos1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 30, column: 11
                S8280=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                switch(S8225){
                  case 0 : 
                    if(tableAlignedWithSensor.getprestatus()){//sysj\controllerRotaryTable.sysj line: 31, column: 12
                      System.out.println("tableAlignedWithSensor");//sysj\controllerRotaryTable.sysj line: 32, column: 6
                      S8225=1;
                      thread8642(tdone,ends);
                      thread8643(tdone,ends);
                      int biggest8644 = 0;
                      if(ends[8]>=biggest8644){
                        biggest8644=ends[8];
                      }
                      if(ends[9]>=biggest8644){
                        biggest8644=ends[9];
                      }
                      if(biggest8644 == 1){
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
                    thread8645(tdone,ends);
                    thread8646(tdone,ends);
                    int biggest8647 = 0;
                    if(ends[8]>=biggest8647){
                      biggest8647=ends[8];
                    }
                    if(ends[9]>=biggest8647){
                      biggest8647=ends[9];
                    }
                    if(biggest8647 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest8647 == 0){
                      System.out.println("capOnBottleAtPos1");//sysj\controllerRotaryTable.sysj line: 40, column: 5
                      S8280=0;
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

  public void thread8639(int [] tdone, int [] ends){
        switch(S7981){
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

  public void thread8638(int [] tdone, int [] ends){
        switch(S7973){
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

  public void thread8637(int [] tdone, int [] ends){
        switch(S7965){
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

  public void thread8636(int [] tdone, int [] ends){
        switch(S7957){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7951){
          case 0 : 
            S7951=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S7951=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7951=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S7951=1;
            S7951=0;
            if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
              rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
              currsigs.addElement(rotaryTableTrigger);
              S7951=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7951=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8634(int [] tdone, int [] ends){
        S7981=1;
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

  public void thread8633(int [] tdone, int [] ends){
        S7973=1;
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

  public void thread8632(int [] tdone, int [] ends){
        S7965=1;
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

  public void thread8631(int [] tdone, int [] ends){
        S7957=1;
    S7951=0;
    if(rotaryTableTriggerM.getprestatus()){//sysj\controllerRotaryTable.sysj line: 15, column: 26
      rotaryTableTrigger.setPresent();//sysj\controllerRotaryTable.sysj line: 15, column: 47
      currsigs.addElement(rotaryTableTrigger);
      S7951=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S7951=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread8630(int [] tdone, int [] ends){
        switch(S8222){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S8016){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerRotaryTable.sysj line: 13, column: 10
              S8016=1;
              thread8631(tdone,ends);
              thread8632(tdone,ends);
              thread8633(tdone,ends);
              thread8634(tdone,ends);
              int biggest8635 = 0;
              if(ends[3]>=biggest8635){
                biggest8635=ends[3];
              }
              if(ends[4]>=biggest8635){
                biggest8635=ends[4];
              }
              if(ends[5]>=biggest8635){
                biggest8635=ends[5];
              }
              if(ends[6]>=biggest8635){
                biggest8635=ends[6];
              }
              if(biggest8635 == 1){
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
              S8016=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread8636(tdone,ends);
              thread8637(tdone,ends);
              thread8638(tdone,ends);
              thread8639(tdone,ends);
              int biggest8640 = 0;
              if(ends[3]>=biggest8640){
                biggest8640=ends[3];
              }
              if(ends[4]>=biggest8640){
                biggest8640=ends[4];
              }
              if(ends[5]>=biggest8640){
                biggest8640=ends[5];
              }
              if(ends[6]>=biggest8640){
                biggest8640=ends[6];
              }
              if(biggest8640 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest8640 == 0){
                S8016=0;
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

  public void thread8628(int [] tdone, int [] ends){
        S8621=1;
    S8620=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread8627(int [] tdone, int [] ends){
        S8606=1;
    S8544=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread8626(int [] tdone, int [] ends){
        S8514=1;
    S8280=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread8625(int [] tdone, int [] ends){
        S8222=1;
    S8016=0;
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
      switch(S8623){
        case 0 : 
          S8623=0;
          break RUN;
        
        case 1 : 
          S8623=2;
          S8623=2;
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread8625(tdone,ends);
          thread8626(tdone,ends);
          thread8627(tdone,ends);
          thread8628(tdone,ends);
          int biggest8629 = 0;
          if(ends[2]>=biggest8629){
            biggest8629=ends[2];
          }
          if(ends[7]>=biggest8629){
            biggest8629=ends[7];
          }
          if(ends[10]>=biggest8629){
            biggest8629=ends[10];
          }
          if(ends[11]>=biggest8629){
            biggest8629=ends[11];
          }
          if(biggest8629 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          startTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          stopTimer_1.setClear();//sysj\controllerRotaryTable.sysj line: 9, column: 2
          thread8630(tdone,ends);
          thread8641(tdone,ends);
          thread8648(tdone,ends);
          thread8649(tdone,ends);
          int biggest8650 = 0;
          if(ends[2]>=biggest8650){
            biggest8650=ends[2];
          }
          if(ends[7]>=biggest8650){
            biggest8650=ends[7];
          }
          if(ends[10]>=biggest8650){
            biggest8650=ends[10];
          }
          if(ends[11]>=biggest8650){
            biggest8650=ends[11];
          }
          if(biggest8650 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest8650 == 0){
            S8623=0;
            active[1]=0;
            ends[1]=0;
            S8623=0;
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
