import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantRotaryTable extends ClockDomain{
  public PlantRotaryTable(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal alignedSensor = new Signal("alignedSensor", Signal.INPUT);
  public Signal capAtPos1 = new Signal("capAtPos1", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  private Signal rotaryOn_1;
  private Signal rotaryOff_1;
  private int S13860 = 1;
  private int S13628 = 1;
  private int S13545 = 1;
  private int S13696 = 1;
  private int S13632 = 1;
  private int S13764 = 1;
  private int S13700 = 1;
  private int S13832 = 1;
  private int S13768 = 1;
  private int S13858 = 1;
  private int S13840 = 1;
  private int S13834 = 1;
  private int S13848 = 1;
  private int S13856 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread13879(int [] tdone, int [] ends){
        switch(S13856){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 69, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
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
      
    }
  }

  public void thread13878(int [] tdone, int [] ends){
        switch(S13848){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 67, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 67, column: 38
          currsigs.addElement(bottleAtPos5E);
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
      
    }
  }

  public void thread13877(int [] tdone, int [] ends){
        switch(S13840){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S13834){
          case 0 : 
            S13834=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S13834=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S13834=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S13834=1;
            S13834=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S13834=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S13834=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13876(int [] tdone, int [] ends){
        switch(S13858){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread13877(tdone,ends);
        thread13878(tdone,ends);
        thread13879(tdone,ends);
        int biggest13880 = 0;
        if(ends[7]>=biggest13880){
          biggest13880=ends[7];
        }
        if(ends[8]>=biggest13880){
          biggest13880=ends[8];
        }
        if(ends[9]>=biggest13880){
          biggest13880=ends[9];
        }
        if(biggest13880 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest13880 == 0){
          S13858=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread13875(int [] tdone, int [] ends){
        switch(S13832){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S13768){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 53, column: 10
              S13768=1;
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
          
          case 1 : 
            if(bottlePos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 54, column: 10
              S13768=2;
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
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 55, column: 10
              S13768=3;
              System.out.println("bottleAtPos5");//sysj\plantRotaryTable.sysj line: 57, column: 5
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 58, column: 5
              currsigs.addElement(bottleAtPos5);
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
          
          case 3 : 
            if(!bottlePos5.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 56, column: 11
              System.out.println("Not-bottleAtPos5");//sysj\plantRotaryTable.sysj line: 60, column: 4
              S13768=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 58, column: 5
              currsigs.addElement(bottleAtPos5);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13874(int [] tdone, int [] ends){
        switch(S13764){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S13700){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 40, column: 10
              S13700=1;
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
          
          case 1 : 
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 41, column: 10
              S13700=2;
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
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 42, column: 10
              S13700=3;
              System.out.println("capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 44, column: 5
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 45, column: 5
              currsigs.addElement(capOnBottleAtPos1);
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
          
          case 3 : 
            if(!capAtPos1.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 43, column: 11
              System.out.println("Not-capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 47, column: 4
              S13700=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 45, column: 5
              currsigs.addElement(capOnBottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13873(int [] tdone, int [] ends){
        switch(S13696){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S13632){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 27, column: 10
              S13632=1;
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
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 28, column: 10
              S13632=2;
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
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 29, column: 10
              S13632=3;
              System.out.println("tableAlignedWithSensor");//sysj\plantRotaryTable.sysj line: 31, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 32, column: 5
              currsigs.addElement(tableAlignedWithSensor);
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
          
          case 3 : 
            if(!alignedSensor.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 30, column: 11
              System.out.println("Not-tableAlignedWithSensor");//sysj\plantRotaryTable.sysj line: 34, column: 4
              S13632=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 32, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13872(int [] tdone, int [] ends){
        switch(S13628){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S13545){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
              S13545=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 14, column: 5
              currsigs.addElement(rotaryOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 16, column: 10
              S13545=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 17, column: 20
                S13545=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOn");//sysj\plantRotaryTable.sysj line: 18, column: 5
                rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 19, column: 5
                currsigs.addElement(rotaryOn_1);
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
          
          case 2 : 
            if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 17, column: 20
              S13545=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 19, column: 5
              currsigs.addElement(rotaryOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 21, column: 10
              S13545=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
                S13545=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 13, column: 5
                rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 14, column: 5
                currsigs.addElement(rotaryOff_1);
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
          
        }
        break;
      
    }
  }

  public void thread13869(int [] tdone, int [] ends){
        S13856=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 69, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread13868(int [] tdone, int [] ends){
        S13848=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 67, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 67, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread13867(int [] tdone, int [] ends){
        S13840=1;
    S13834=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      S13834=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S13834=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread13866(int [] tdone, int [] ends){
        S13858=1;
    thread13867(tdone,ends);
    thread13868(tdone,ends);
    thread13869(tdone,ends);
    int biggest13870 = 0;
    if(ends[7]>=biggest13870){
      biggest13870=ends[7];
    }
    if(ends[8]>=biggest13870){
      biggest13870=ends[8];
    }
    if(ends[9]>=biggest13870){
      biggest13870=ends[9];
    }
    if(biggest13870 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread13865(int [] tdone, int [] ends){
        S13832=1;
    S13768=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread13864(int [] tdone, int [] ends){
        S13764=1;
    S13700=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread13863(int [] tdone, int [] ends){
        S13696=1;
    S13632=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread13862(int [] tdone, int [] ends){
        S13628=1;
    S13545=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
      S13545=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 13, column: 5
      rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 14, column: 5
      currsigs.addElement(rotaryOff_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S13860){
        case 0 : 
          S13860=0;
          break RUN;
        
        case 1 : 
          S13860=2;
          S13860=2;
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread13862(tdone,ends);
          thread13863(tdone,ends);
          thread13864(tdone,ends);
          thread13865(tdone,ends);
          thread13866(tdone,ends);
          int biggest13871 = 0;
          if(ends[2]>=biggest13871){
            biggest13871=ends[2];
          }
          if(ends[3]>=biggest13871){
            biggest13871=ends[3];
          }
          if(ends[4]>=biggest13871){
            biggest13871=ends[4];
          }
          if(ends[5]>=biggest13871){
            biggest13871=ends[5];
          }
          if(ends[6]>=biggest13871){
            biggest13871=ends[6];
          }
          if(biggest13871 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread13872(tdone,ends);
          thread13873(tdone,ends);
          thread13874(tdone,ends);
          thread13875(tdone,ends);
          thread13876(tdone,ends);
          int biggest13881 = 0;
          if(ends[2]>=biggest13881){
            biggest13881=ends[2];
          }
          if(ends[3]>=biggest13881){
            biggest13881=ends[3];
          }
          if(ends[4]>=biggest13881){
            biggest13881=ends[4];
          }
          if(ends[5]>=biggest13881){
            biggest13881=ends[5];
          }
          if(ends[6]>=biggest13881){
            biggest13881=ends[6];
          }
          if(biggest13881 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest13881 == 0){
            S13860=0;
            active[1]=0;
            ends[1]=0;
            S13860=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotaryOn_1 = new Signal();
    rotaryOff_1 = new Signal();
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
          rotaryTableTrigger.gethook();
          enable.gethook();
          alignedSensor.gethook();
          capAtPos1.gethook();
          bottlePos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      enable.setpreclear();
      alignedSensor.setpreclear();
      capAtPos1.setpreclear();
      bottlePos5.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      rotaryOn_1.setpreclear();
      rotaryOff_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = alignedSensor.getStatus() ? alignedSensor.setprepresent() : alignedSensor.setpreclear();
      alignedSensor.setpreval(alignedSensor.getValue());
      alignedSensor.setClear();
      dummyint = capAtPos1.getStatus() ? capAtPos1.setprepresent() : capAtPos1.setpreclear();
      capAtPos1.setpreval(capAtPos1.getValue());
      capAtPos1.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      tableAlignedWithSensorE.sethook();
      tableAlignedWithSensorE.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      rotaryOn_1.setClear();
      rotaryOff_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
        enable.gethook();
        alignedSensor.gethook();
        capAtPos1.gethook();
        bottlePos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
