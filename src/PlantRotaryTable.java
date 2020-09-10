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
  private int S10190 = 1;
  private int S9964 = 1;
  private int S9881 = 1;
  private int S10032 = 1;
  private int S9968 = 1;
  private int S10097 = 1;
  private int S10041 = 1;
  private int S10044 = 1;
  private int S10047 = 1;
  private int S10162 = 1;
  private int S10106 = 1;
  private int S10109 = 1;
  private int S10112 = 1;
  private int S10188 = 1;
  private int S10170 = 1;
  private int S10164 = 1;
  private int S10178 = 1;
  private int S10186 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread10221(int [] tdone, int [] ends){
        switch(S10186){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 69, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread10220(int [] tdone, int [] ends){
        switch(S10178){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 67, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 67, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread10219(int [] tdone, int [] ends){
        switch(S10170){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S10164){
          case 0 : 
            S10164=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S10164=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S10164=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S10164=1;
            S10164=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
              tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
              currsigs.addElement(tableAlignedWithSensorE);
              S10164=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S10164=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10218(int [] tdone, int [] ends){
        switch(S10188){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread10219(tdone,ends);
        thread10220(tdone,ends);
        thread10221(tdone,ends);
        int biggest10222 = 0;
        if(ends[11]>=biggest10222){
          biggest10222=ends[11];
        }
        if(ends[12]>=biggest10222){
          biggest10222=ends[12];
        }
        if(ends[13]>=biggest10222){
          biggest10222=ends[13];
        }
        if(biggest10222 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest10222 == 0){
          S10188=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread10216(int [] tdone, int [] ends){
        switch(S10112){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(!bottlePos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 60, column: 11
          S10112=0;
          active[9]=0;
          ends[9]=0;
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

  public void thread10215(int [] tdone, int [] ends){
        switch(S10109){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 58, column: 11
          S10109=0;
          active[8]=0;
          ends[8]=0;
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

  public void thread10213(int [] tdone, int [] ends){
        S10112=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread10212(int [] tdone, int [] ends){
        S10109=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread10211(int [] tdone, int [] ends){
        switch(S10162){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S10106){
          case 0 : 
            if(bottlePos5.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 53, column: 11
              System.out.println("Not-bottleAtPos5");//sysj\plantRotaryTable.sysj line: 57, column: 4
              S10106=1;
              thread10212(tdone,ends);
              thread10213(tdone,ends);
              int biggest10214 = 0;
              if(ends[8]>=biggest10214){
                biggest10214=ends[8];
              }
              if(ends[9]>=biggest10214){
                biggest10214=ends[9];
              }
              if(biggest10214 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 55, column: 5
              currsigs.addElement(bottleAtPos5);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            thread10215(tdone,ends);
            thread10216(tdone,ends);
            int biggest10217 = 0;
            if(ends[8]>=biggest10217){
              biggest10217=ends[8];
            }
            if(ends[9]>=biggest10217){
              biggest10217=ends[9];
            }
            if(biggest10217 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest10217 == 0){
              S10106=0;
              System.out.println("bottleAtPos5");//sysj\plantRotaryTable.sysj line: 54, column: 5
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 55, column: 5
              currsigs.addElement(bottleAtPos5);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10209(int [] tdone, int [] ends){
        switch(S10047){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(!capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 47, column: 11
          S10047=0;
          active[6]=0;
          ends[6]=0;
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

  public void thread10208(int [] tdone, int [] ends){
        switch(S10044){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 45, column: 11
          S10044=0;
          active[5]=0;
          ends[5]=0;
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

  public void thread10206(int [] tdone, int [] ends){
        S10047=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10205(int [] tdone, int [] ends){
        S10044=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread10204(int [] tdone, int [] ends){
        switch(S10097){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S10041){
          case 0 : 
            if(capAtPos1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 40, column: 11
              System.out.println("Not-capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 44, column: 4
              S10041=1;
              thread10205(tdone,ends);
              thread10206(tdone,ends);
              int biggest10207 = 0;
              if(ends[5]>=biggest10207){
                biggest10207=ends[5];
              }
              if(ends[6]>=biggest10207){
                biggest10207=ends[6];
              }
              if(biggest10207 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 42, column: 5
              currsigs.addElement(capOnBottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            thread10208(tdone,ends);
            thread10209(tdone,ends);
            int biggest10210 = 0;
            if(ends[5]>=biggest10210){
              biggest10210=ends[5];
            }
            if(ends[6]>=biggest10210){
              biggest10210=ends[6];
            }
            if(biggest10210 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest10210 == 0){
              S10041=0;
              System.out.println("capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 41, column: 5
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 42, column: 5
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

  public void thread10203(int [] tdone, int [] ends){
        switch(S10032){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S9968){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 27, column: 10
              S9968=1;
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
              S9968=2;
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
              S9968=3;
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
              S9968=0;
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

  public void thread10202(int [] tdone, int [] ends){
        switch(S9964){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9881){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
              S9881=1;
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
              S9881=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 17, column: 20
                S9881=3;
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
              S9881=3;
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
              S9881=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
                S9881=1;
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

  public void thread10199(int [] tdone, int [] ends){
        S10186=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 69, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread10198(int [] tdone, int [] ends){
        S10178=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 67, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 67, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread10197(int [] tdone, int [] ends){
        S10170=1;
    S10164=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 65, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      S10164=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S10164=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread10196(int [] tdone, int [] ends){
        S10188=1;
    thread10197(tdone,ends);
    thread10198(tdone,ends);
    thread10199(tdone,ends);
    int biggest10200 = 0;
    if(ends[11]>=biggest10200){
      biggest10200=ends[11];
    }
    if(ends[12]>=biggest10200){
      biggest10200=ends[12];
    }
    if(ends[13]>=biggest10200){
      biggest10200=ends[13];
    }
    if(biggest10200 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread10195(int [] tdone, int [] ends){
        S10162=1;
    S10106=0;
    System.out.println("bottleAtPos5");//sysj\plantRotaryTable.sysj line: 54, column: 5
    bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 55, column: 5
    currsigs.addElement(bottleAtPos5);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread10194(int [] tdone, int [] ends){
        S10097=1;
    S10041=0;
    System.out.println("capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 41, column: 5
    capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 42, column: 5
    currsigs.addElement(capOnBottleAtPos1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread10193(int [] tdone, int [] ends){
        S10032=1;
    S9968=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10192(int [] tdone, int [] ends){
        S9964=1;
    S9881=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 12, column: 21
      S9881=1;
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
      switch(S10190){
        case 0 : 
          S10190=0;
          break RUN;
        
        case 1 : 
          S10190=2;
          S10190=2;
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread10192(tdone,ends);
          thread10193(tdone,ends);
          thread10194(tdone,ends);
          thread10195(tdone,ends);
          thread10196(tdone,ends);
          int biggest10201 = 0;
          if(ends[2]>=biggest10201){
            biggest10201=ends[2];
          }
          if(ends[3]>=biggest10201){
            biggest10201=ends[3];
          }
          if(ends[4]>=biggest10201){
            biggest10201=ends[4];
          }
          if(ends[7]>=biggest10201){
            biggest10201=ends[7];
          }
          if(ends[10]>=biggest10201){
            biggest10201=ends[10];
          }
          if(biggest10201 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 9, column: 2
          thread10202(tdone,ends);
          thread10203(tdone,ends);
          thread10204(tdone,ends);
          thread10211(tdone,ends);
          thread10218(tdone,ends);
          int biggest10223 = 0;
          if(ends[2]>=biggest10223){
            biggest10223=ends[2];
          }
          if(ends[3]>=biggest10223){
            biggest10223=ends[3];
          }
          if(ends[4]>=biggest10223){
            biggest10223=ends[4];
          }
          if(ends[7]>=biggest10223){
            biggest10223=ends[7];
          }
          if(ends[10]>=biggest10223){
            biggest10223=ends[10];
          }
          if(biggest10223 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10223 == 0){
            S10190=0;
            active[1]=0;
            ends[1]=0;
            S10190=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
