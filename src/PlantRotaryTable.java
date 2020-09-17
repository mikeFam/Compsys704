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
  private int S15896 = 1;
  private int S15664 = 1;
  private int S15581 = 1;
  private int S15732 = 1;
  private int S15668 = 1;
  private int S15800 = 1;
  private int S15736 = 1;
  private int S15868 = 1;
  private int S15804 = 1;
  private int S15894 = 1;
  private int S15876 = 1;
  private int S15870 = 1;
  private int S15884 = 1;
  private int S15892 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread15915(int [] tdone, int [] ends){
        switch(S15892){
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

  public void thread15914(int [] tdone, int [] ends){
        switch(S15884){
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

  public void thread15913(int [] tdone, int [] ends){
        switch(S15876){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S15870){
          case 0 : 
            S15870=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S15870=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15870=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S15870=1;
            S15870=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S15870=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15870=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15912(int [] tdone, int [] ends){
        switch(S15894){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread15913(tdone,ends);
        thread15914(tdone,ends);
        thread15915(tdone,ends);
        int biggest15916 = 0;
        if(ends[7]>=biggest15916){
          biggest15916=ends[7];
        }
        if(ends[8]>=biggest15916){
          biggest15916=ends[8];
        }
        if(ends[9]>=biggest15916){
          biggest15916=ends[9];
        }
        if(biggest15916 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest15916 == 0){
          S15894=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread15911(int [] tdone, int [] ends){
        switch(S15868){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15804){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 53, column: 10
              S15804=1;
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
              S15804=2;
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
              S15804=3;
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
              S15804=0;
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

  public void thread15910(int [] tdone, int [] ends){
        switch(S15800){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15736){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 40, column: 10
              S15736=1;
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
              S15736=2;
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
              S15736=3;
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
              S15736=0;
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

  public void thread15909(int [] tdone, int [] ends){
        switch(S15732){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15668){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 27, column: 10
              S15668=1;
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
              S15668=2;
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
              S15668=3;
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
              S15668=0;
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

  public void thread15908(int [] tdone, int [] ends){
        switch(S15664){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15581){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
              S15581=1;
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
              S15581=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 17, column: 20
                S15581=3;
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
              S15581=3;
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
              S15581=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
                S15581=1;
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

  public void thread15905(int [] tdone, int [] ends){
        S15892=1;
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

  public void thread15904(int [] tdone, int [] ends){
        S15884=1;
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

  public void thread15903(int [] tdone, int [] ends){
        S15876=1;
    S15870=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      S15870=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15870=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread15902(int [] tdone, int [] ends){
        S15894=1;
    thread15903(tdone,ends);
    thread15904(tdone,ends);
    thread15905(tdone,ends);
    int biggest15906 = 0;
    if(ends[7]>=biggest15906){
      biggest15906=ends[7];
    }
    if(ends[8]>=biggest15906){
      biggest15906=ends[8];
    }
    if(ends[9]>=biggest15906){
      biggest15906=ends[9];
    }
    if(biggest15906 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread15901(int [] tdone, int [] ends){
        S15868=1;
    S15804=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread15900(int [] tdone, int [] ends){
        S15800=1;
    S15736=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread15899(int [] tdone, int [] ends){
        S15732=1;
    S15668=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread15898(int [] tdone, int [] ends){
        S15664=1;
    S15581=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
      S15581=1;
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
      switch(S15896){
        case 0 : 
          S15896=0;
          break RUN;
        
        case 1 : 
          S15896=2;
          S15896=2;
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread15898(tdone,ends);
          thread15899(tdone,ends);
          thread15900(tdone,ends);
          thread15901(tdone,ends);
          thread15902(tdone,ends);
          int biggest15907 = 0;
          if(ends[2]>=biggest15907){
            biggest15907=ends[2];
          }
          if(ends[3]>=biggest15907){
            biggest15907=ends[3];
          }
          if(ends[4]>=biggest15907){
            biggest15907=ends[4];
          }
          if(ends[5]>=biggest15907){
            biggest15907=ends[5];
          }
          if(ends[6]>=biggest15907){
            biggest15907=ends[6];
          }
          if(biggest15907 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread15908(tdone,ends);
          thread15909(tdone,ends);
          thread15910(tdone,ends);
          thread15911(tdone,ends);
          thread15912(tdone,ends);
          int biggest15917 = 0;
          if(ends[2]>=biggest15917){
            biggest15917=ends[2];
          }
          if(ends[3]>=biggest15917){
            biggest15917=ends[3];
          }
          if(ends[4]>=biggest15917){
            biggest15917=ends[4];
          }
          if(ends[5]>=biggest15917){
            biggest15917=ends[5];
          }
          if(ends[6]>=biggest15917){
            biggest15917=ends[6];
          }
          if(biggest15917 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15917 == 0){
            S15896=0;
            active[1]=0;
            ends[1]=0;
            S15896=0;
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
