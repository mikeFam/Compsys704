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
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal alignedSensor = new Signal("alignedSensor", Signal.INPUT);
  public Signal capAtPos1 = new Signal("capAtPos1", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal enableRotaryTable = new Signal("enableRotaryTable", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos1M = new Signal("bottleAtPos1M", Signal.OUTPUT);
  public Signal bottleAtPos2M = new Signal("bottleAtPos2M", Signal.OUTPUT);
  public Signal bottleAtPos3M = new Signal("bottleAtPos3M", Signal.OUTPUT);
  public Signal bottleAtPos4M = new Signal("bottleAtPos4M", Signal.OUTPUT);
  public Signal bottleAtPos5M = new Signal("bottleAtPos5M", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAt2_1;
  private Signal bottleAt3_1;
  private Signal bottleAt4_1;
  private Signal bottleAt5_1;
  private Signal empty_1;
  private Signal rotaryOn_1;
  private Signal rotaryOff_1;
  private Signal bottlePos_1;
  private int bottlecount_thread_7;//sysj\plantRotaryTable.sysj line: 147, column: 3
  private int data_thread_5;//sysj\plantRotaryTable.sysj line: 60, column: 3
  private int S22911 = 1;
  private int S16109 = 1;
  private int S16026 = 1;
  private int S16150 = 1;
  private int S16119 = 1;
  private int S16191 = 1;
  private int S16160 = 1;
  private int S17398 = 1;
  private int S16194 = 1;
  private int S16312 = 1;
  private int S16239 = 1;
  private int S16238 = 1;
  private int S16237 = 1;
  private int S17565 = 1;
  private int S17453 = 1;
  private int S17399 = 1;
  private int S17627 = 1;
  private int S17570 = 1;
  private int S17693 = 1;
  private int S17635 = 1;
  private int S17643 = 1;
  private int S17651 = 1;
  private int S17659 = 1;
  private int S17667 = 1;
  private int S17675 = 1;
  private int S17683 = 1;
  private int S17691 = 1;
  private int S17735 = 1;
  private int S17701 = 1;
  private int S17709 = 1;
  private int S17717 = 1;
  private int S17725 = 1;
  private int S17733 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread22958(int [] tdone, int [] ends){
        switch(S17733){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 189, column: 24
          bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 189, column: 38
          currsigs.addElement(bottleAtPos5M);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread22957(int [] tdone, int [] ends){
        switch(S17725){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 24
          bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 187, column: 38
          currsigs.addElement(bottleAtPos4M);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread22956(int [] tdone, int [] ends){
        switch(S17717){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 185, column: 24
          bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 185, column: 38
          currsigs.addElement(bottleAtPos3M);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread22955(int [] tdone, int [] ends){
        switch(S17709){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 24
          bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 183, column: 38
          currsigs.addElement(bottleAtPos2M);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread22954(int [] tdone, int [] ends){
        switch(S17701){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 181, column: 24
          bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 181, column: 38
          currsigs.addElement(bottleAtPos1M);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread22953(int [] tdone, int [] ends){
        switch(S17735){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        thread22954(tdone,ends);
        thread22955(tdone,ends);
        thread22956(tdone,ends);
        thread22957(tdone,ends);
        thread22958(tdone,ends);
        int biggest22959 = 0;
        if(ends[18]>=biggest22959){
          biggest22959=ends[18];
        }
        if(ends[19]>=biggest22959){
          biggest22959=ends[19];
        }
        if(ends[20]>=biggest22959){
          biggest22959=ends[20];
        }
        if(ends[21]>=biggest22959){
          biggest22959=ends[21];
        }
        if(ends[22]>=biggest22959){
          biggest22959=ends[22];
        }
        if(biggest22959 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        //FINXME code
        if(biggest22959 == 0){
          S17735=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread22951(int [] tdone, int [] ends){
        switch(S17691){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 177, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 177, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread22950(int [] tdone, int [] ends){
        switch(S17683){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 175, column: 24
          bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 175, column: 38
          currsigs.addElement(bottleAtPos4E);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread22949(int [] tdone, int [] ends){
        switch(S17675){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 173, column: 24
          bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 173, column: 38
          currsigs.addElement(bottleAtPos3E);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread22948(int [] tdone, int [] ends){
        switch(S17667){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 171, column: 24
          bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 171, column: 38
          currsigs.addElement(bottleAtPos2E);
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

  public void thread22947(int [] tdone, int [] ends){
        switch(S17659){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 169, column: 24
          bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 169, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread22946(int [] tdone, int [] ends){
        switch(S17651){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 167, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 167, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread22945(int [] tdone, int [] ends){
        switch(S17643){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 165, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 165, column: 38
          currsigs.addElement(bottleAtPos5E);
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
      
    }
  }

  public void thread22944(int [] tdone, int [] ends){
        switch(S17635){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 163, column: 24
          tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 163, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread22943(int [] tdone, int [] ends){
        switch(S17693){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread22944(tdone,ends);
        thread22945(tdone,ends);
        thread22946(tdone,ends);
        thread22947(tdone,ends);
        thread22948(tdone,ends);
        thread22949(tdone,ends);
        thread22950(tdone,ends);
        thread22951(tdone,ends);
        int biggest22952 = 0;
        if(ends[9]>=biggest22952){
          biggest22952=ends[9];
        }
        if(ends[10]>=biggest22952){
          biggest22952=ends[10];
        }
        if(ends[11]>=biggest22952){
          biggest22952=ends[11];
        }
        if(ends[12]>=biggest22952){
          biggest22952=ends[12];
        }
        if(ends[13]>=biggest22952){
          biggest22952=ends[13];
        }
        if(ends[14]>=biggest22952){
          biggest22952=ends[14];
        }
        if(ends[15]>=biggest22952){
          biggest22952=ends[15];
        }
        if(ends[16]>=biggest22952){
          biggest22952=ends[16];
        }
        if(biggest22952 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest22952 == 0){
          S17693=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread22942(int [] tdone, int [] ends){
        switch(S17627){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S17570){
          case 0 : 
            S17570=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
              if(bottlecount_thread_7 > 0) {//sysj\plantRotaryTable.sysj line: 150, column: 5
                bottlecount_thread_7 = bottlecount_thread_7 - 1;//sysj\plantRotaryTable.sysj line: 151, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
                bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
                bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S17570=1;
            S17570=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
              if(bottlecount_thread_7 > 0) {//sysj\plantRotaryTable.sysj line: 150, column: 5
                bottlecount_thread_7 = bottlecount_thread_7 - 1;//sysj\plantRotaryTable.sysj line: 151, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
                bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
                bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
                  currsigs.addElement(empty_1);
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S17570=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread22941(int [] tdone, int [] ends){
        switch(S17565){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S17453){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 109, column: 10
              S17453=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S17399){
                case 0 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 114, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 116, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantRotaryTable.sysj line: 116, column: 6
                    bottleAt2_1.setPresent();//sysj\plantRotaryTable.sysj line: 117, column: 6
                    currsigs.addElement(bottleAt2_1);
                    System.out.println("Hello2");//sysj\plantRotaryTable.sysj line: 118, column: 6
                    S17399=1;
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
                
                case 1 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 119, column: 13
                    S17399=2;
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
                  if(rotaryOn_1.getprestatus() && bottleAtPos2.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 120, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 122, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantRotaryTable.sysj line: 122, column: 6
                    bottleAt3_1.setPresent();//sysj\plantRotaryTable.sysj line: 123, column: 6
                    currsigs.addElement(bottleAt3_1);
                    System.out.println("Hello3");//sysj\plantRotaryTable.sysj line: 124, column: 6
                    S17399=3;
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
                
                case 3 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 125, column: 13
                    S17399=4;
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
                
                case 4 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos3.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 126, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 128, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(3);//sysj\plantRotaryTable.sysj line: 128, column: 6
                    bottleAt4_1.setPresent();//sysj\plantRotaryTable.sysj line: 129, column: 6
                    currsigs.addElement(bottleAt4_1);
                    System.out.println("Hello4");//sysj\plantRotaryTable.sysj line: 130, column: 6
                    S17399=5;
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
                
                case 5 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 131, column: 13
                    S17399=6;
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
                
                case 6 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos4.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 132, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 134, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(4);//sysj\plantRotaryTable.sysj line: 134, column: 6
                    S17399=7;
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
                
                case 7 : 
                  S17399=7;
                  bottleAt5_1.setPresent();//sysj\plantRotaryTable.sysj line: 136, column: 6
                  currsigs.addElement(bottleAt5_1);
                  System.out.println("Hello5");//sysj\plantRotaryTable.sysj line: 137, column: 6
                  S17399=8;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                  break;
                
                case 8 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 138, column: 13
                    bottleDec_1.setPresent();//sysj\plantRotaryTable.sysj line: 139, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
                    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
                    currsigs.addElement(bottleAt1_1);
                    System.out.println("Hello1");//sysj\plantRotaryTable.sysj line: 113, column: 6
                    S17399=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 142, column: 10
              S17453=0;
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
              bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
              currsigs.addElement(bottleAt1_1);
              System.out.println("Hello1");//sysj\plantRotaryTable.sysj line: 113, column: 6
              S17399=0;
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
        break;
      
    }
  }

  public void thread22940(int [] tdone, int [] ends){
        switch(S17398){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S16194){
          case 0 : 
            if(enableRotaryTable.getprestatus()){//sysj\plantRotaryTable.sysj line: 61, column: 10
              S16194=1;
              if((!enableRotaryTable.getprestatus())){//sysj\plantRotaryTable.sysj line: 62, column: 20
                data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 60, column: 3
                S16194=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S16312=0;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 63, column: 8
                  System.out.println("hi1");//sysj\plantRotaryTable.sysj line: 65, column: 7
                  bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 66, column: 7
                  currsigs.addElement(bottleAtPos1);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S16312=1;
                  if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 69, column: 8
                    S16239=0;
                    System.out.println("hi2");//sysj\plantRotaryTable.sysj line: 71, column: 7
                    bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 7
                    currsigs.addElement(bottleAtPos2);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S16239=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 75, column: 13
                      S16238=0;
                      System.out.println("hi3");//sysj\plantRotaryTable.sysj line: 77, column: 7
                      bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 78, column: 7
                      currsigs.addElement(bottleAtPos3);
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S16238=1;
                      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 81, column: 13
                        S16237=0;
                        System.out.println("hi4");//sysj\plantRotaryTable.sysj line: 83, column: 7
                        bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 84, column: 7
                        currsigs.addElement(bottleAtPos4);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S16237=1;
                        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 87, column: 13
                          System.out.println("hi5");//sysj\plantRotaryTable.sysj line: 89, column: 7
                          bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 90, column: 7
                          currsigs.addElement(bottleAtPos5);
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S16312=2;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if((!enableRotaryTable.getprestatus())){//sysj\plantRotaryTable.sysj line: 62, column: 20
              data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 60, column: 3
              S16194=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S16312){
                case 0 : 
                  if(bottleAt2_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 64, column: 12
                    S16312=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 69, column: 8
                      S16239=0;
                      System.out.println("hi2");//sysj\plantRotaryTable.sysj line: 71, column: 7
                      bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 7
                      currsigs.addElement(bottleAtPos2);
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S16239=1;
                      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 75, column: 13
                        S16238=0;
                        System.out.println("hi3");//sysj\plantRotaryTable.sysj line: 77, column: 7
                        bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 78, column: 7
                        currsigs.addElement(bottleAtPos3);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S16238=1;
                        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 81, column: 13
                          S16237=0;
                          System.out.println("hi4");//sysj\plantRotaryTable.sysj line: 83, column: 7
                          bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 84, column: 7
                          currsigs.addElement(bottleAtPos4);
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S16237=1;
                          if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 87, column: 13
                            System.out.println("hi5");//sysj\plantRotaryTable.sysj line: 89, column: 7
                            bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 90, column: 7
                            currsigs.addElement(bottleAtPos5);
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S16312=2;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 66, column: 7
                    currsigs.addElement(bottleAtPos1);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 1 : 
                  switch(S16239){
                    case 0 : 
                      if(bottleAt3_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 70, column: 12
                        S16312=2;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 7
                        currsigs.addElement(bottleAtPos2);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      switch(S16238){
                        case 0 : 
                          if(bottleAt4_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 76, column: 12
                            S16312=2;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 78, column: 7
                            currsigs.addElement(bottleAtPos3);
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          break;
                        
                        case 1 : 
                          switch(S16237){
                            case 0 : 
                              if(bottleAt5_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 82, column: 12
                                S16312=2;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 84, column: 7
                                currsigs.addElement(bottleAtPos4);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              break;
                            
                            case 1 : 
                              if(bottleAt1_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 88, column: 12
                                S16312=2;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 90, column: 7
                                currsigs.addElement(bottleAtPos5);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              break;
                            
                          }
                          break;
                        
                      }
                      break;
                    
                  }
                  break;
                
                case 2 : 
                  S16312=2;
                  data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 60, column: 3
                  S16194=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread22939(int [] tdone, int [] ends){
        switch(S16191){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S16160){
          case 0 : 
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 50, column: 10
              S16160=1;
              if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 51, column: 21
                S16160=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 52, column: 5
                currsigs.addElement(capOnBottleAtPos1);
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
            if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 51, column: 21
              S16160=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 52, column: 5
              currsigs.addElement(capOnBottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 54, column: 10
              S16160=0;
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
        break;
      
    }
  }

  public void thread22938(int [] tdone, int [] ends){
        switch(S16150){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S16119){
          case 0 : 
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 40, column: 10
              S16119=1;
              if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 41, column: 21
                S16119=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 42, column: 5
                currsigs.addElement(tableAlignedWithSensor);
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
            if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 41, column: 21
              S16119=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 42, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 44, column: 10
              S16119=0;
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
          
        }
        break;
      
    }
  }

  public void thread22937(int [] tdone, int [] ends){
        switch(S16109){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S16026){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 25, column: 21
              S16026=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 27, column: 5
              currsigs.addElement(rotaryOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 29, column: 10
              S16026=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 30, column: 20
                S16026=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOn");//sysj\plantRotaryTable.sysj line: 31, column: 5
                rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 32, column: 5
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
            if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 30, column: 20
              S16026=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 32, column: 5
              currsigs.addElement(rotaryOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 34, column: 10
              S16026=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 25, column: 21
                S16026=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 26, column: 5
                rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 27, column: 5
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

  public void thread22934(int [] tdone, int [] ends){
        S17733=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 189, column: 24
      bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 189, column: 38
      currsigs.addElement(bottleAtPos5M);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread22933(int [] tdone, int [] ends){
        S17725=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 24
      bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 187, column: 38
      currsigs.addElement(bottleAtPos4M);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread22932(int [] tdone, int [] ends){
        S17717=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 185, column: 24
      bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 185, column: 38
      currsigs.addElement(bottleAtPos3M);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread22931(int [] tdone, int [] ends){
        S17709=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 24
      bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 183, column: 38
      currsigs.addElement(bottleAtPos2M);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread22930(int [] tdone, int [] ends){
        S17701=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 181, column: 24
      bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 181, column: 38
      currsigs.addElement(bottleAtPos1M);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread22929(int [] tdone, int [] ends){
        S17735=1;
    thread22930(tdone,ends);
    thread22931(tdone,ends);
    thread22932(tdone,ends);
    thread22933(tdone,ends);
    thread22934(tdone,ends);
    int biggest22935 = 0;
    if(ends[18]>=biggest22935){
      biggest22935=ends[18];
    }
    if(ends[19]>=biggest22935){
      biggest22935=ends[19];
    }
    if(ends[20]>=biggest22935){
      biggest22935=ends[20];
    }
    if(ends[21]>=biggest22935){
      biggest22935=ends[21];
    }
    if(ends[22]>=biggest22935){
      biggest22935=ends[22];
    }
    if(biggest22935 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread22927(int [] tdone, int [] ends){
        S17691=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 177, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 177, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread22926(int [] tdone, int [] ends){
        S17683=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 175, column: 24
      bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 175, column: 38
      currsigs.addElement(bottleAtPos4E);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread22925(int [] tdone, int [] ends){
        S17675=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 173, column: 24
      bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 173, column: 38
      currsigs.addElement(bottleAtPos3E);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread22924(int [] tdone, int [] ends){
        S17667=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 171, column: 24
      bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 171, column: 38
      currsigs.addElement(bottleAtPos2E);
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

  public void thread22923(int [] tdone, int [] ends){
        S17659=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 169, column: 24
      bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 169, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread22922(int [] tdone, int [] ends){
        S17651=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 167, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 167, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread22921(int [] tdone, int [] ends){
        S17643=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 165, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 165, column: 38
      currsigs.addElement(bottleAtPos5E);
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

  public void thread22920(int [] tdone, int [] ends){
        S17635=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 163, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 163, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread22919(int [] tdone, int [] ends){
        S17693=1;
    thread22920(tdone,ends);
    thread22921(tdone,ends);
    thread22922(tdone,ends);
    thread22923(tdone,ends);
    thread22924(tdone,ends);
    thread22925(tdone,ends);
    thread22926(tdone,ends);
    thread22927(tdone,ends);
    int biggest22928 = 0;
    if(ends[9]>=biggest22928){
      biggest22928=ends[9];
    }
    if(ends[10]>=biggest22928){
      biggest22928=ends[10];
    }
    if(ends[11]>=biggest22928){
      biggest22928=ends[11];
    }
    if(ends[12]>=biggest22928){
      biggest22928=ends[12];
    }
    if(ends[13]>=biggest22928){
      biggest22928=ends[13];
    }
    if(ends[14]>=biggest22928){
      biggest22928=ends[14];
    }
    if(ends[15]>=biggest22928){
      biggest22928=ends[15];
    }
    if(ends[16]>=biggest22928){
      biggest22928=ends[16];
    }
    if(biggest22928 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread22918(int [] tdone, int [] ends){
        S17627=1;
    bottlecount_thread_7 = 10;//sysj\plantRotaryTable.sysj line: 147, column: 3
    S17570=0;
    if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
      if(bottlecount_thread_7 > 0) {//sysj\plantRotaryTable.sysj line: 150, column: 5
        bottlecount_thread_7 = bottlecount_thread_7 - 1;//sysj\plantRotaryTable.sysj line: 151, column: 6
      }
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
        bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
        if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
          currsigs.addElement(empty_1);
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
      else {
        if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
          currsigs.addElement(empty_1);
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 12
        bottlecount_thread_7 = 5;//sysj\plantRotaryTable.sysj line: 154, column: 5
        if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
          currsigs.addElement(empty_1);
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
      else {
        if(bottlecount_thread_7 == 0){//sysj\plantRotaryTable.sysj line: 156, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 157, column: 4
          currsigs.addElement(empty_1);
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          S17570=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
    }
  }

  public void thread22917(int [] tdone, int [] ends){
        S17565=1;
    S17453=0;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
    currsigs.addElement(bottleAt1_1);
    System.out.println("Hello1");//sysj\plantRotaryTable.sysj line: 113, column: 6
    S17399=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread22916(int [] tdone, int [] ends){
        S17398=1;
    data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 60, column: 3
    S16194=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread22915(int [] tdone, int [] ends){
        S16191=1;
    S16160=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread22914(int [] tdone, int [] ends){
        S16150=1;
    S16119=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread22913(int [] tdone, int [] ends){
        S16109=1;
    S16026=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 25, column: 21
      S16026=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 26, column: 5
      rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 27, column: 5
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
      switch(S22911){
        case 0 : 
          S22911=0;
          break RUN;
        
        case 1 : 
          S22911=2;
          S22911=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantRotaryTable.sysj line: 10, column: 1
            public void run() {//sysj\plantRotaryTable.sysj line: 12, column: 21
              org.compsys704.RotaryTable.main(null);//sysj\plantRotaryTable.sysj line: 13, column: 4
            }
            GUI(){//sysj\plantRotaryTable.sysj line: 11, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 21, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 21, column: 2
          thread22913(tdone,ends);
          thread22914(tdone,ends);
          thread22915(tdone,ends);
          thread22916(tdone,ends);
          thread22917(tdone,ends);
          thread22918(tdone,ends);
          thread22919(tdone,ends);
          thread22929(tdone,ends);
          int biggest22936 = 0;
          if(ends[2]>=biggest22936){
            biggest22936=ends[2];
          }
          if(ends[3]>=biggest22936){
            biggest22936=ends[3];
          }
          if(ends[4]>=biggest22936){
            biggest22936=ends[4];
          }
          if(ends[5]>=biggest22936){
            biggest22936=ends[5];
          }
          if(ends[6]>=biggest22936){
            biggest22936=ends[6];
          }
          if(ends[7]>=biggest22936){
            biggest22936=ends[7];
          }
          if(ends[8]>=biggest22936){
            biggest22936=ends[8];
          }
          if(ends[17]>=biggest22936){
            biggest22936=ends[17];
          }
          if(biggest22936 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          thread22937(tdone,ends);
          thread22938(tdone,ends);
          thread22939(tdone,ends);
          thread22940(tdone,ends);
          thread22941(tdone,ends);
          thread22942(tdone,ends);
          thread22943(tdone,ends);
          thread22953(tdone,ends);
          int biggest22960 = 0;
          if(ends[2]>=biggest22960){
            biggest22960=ends[2];
          }
          if(ends[3]>=biggest22960){
            biggest22960=ends[3];
          }
          if(ends[4]>=biggest22960){
            biggest22960=ends[4];
          }
          if(ends[5]>=biggest22960){
            biggest22960=ends[5];
          }
          if(ends[6]>=biggest22960){
            biggest22960=ends[6];
          }
          if(ends[7]>=biggest22960){
            biggest22960=ends[7];
          }
          if(ends[8]>=biggest22960){
            biggest22960=ends[8];
          }
          if(ends[17]>=biggest22960){
            biggest22960=ends[17];
          }
          if(biggest22960 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest22960 == 0){
            S22911=0;
            active[1]=0;
            ends[1]=0;
            S22911=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAt2_1 = new Signal();
    bottleAt3_1 = new Signal();
    bottleAt4_1 = new Signal();
    bottleAt5_1 = new Signal();
    empty_1 = new Signal();
    rotaryOn_1 = new Signal();
    rotaryOff_1 = new Signal();
    bottlePos_1 = new Signal();
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
          refill.gethook();
          alignedSensor.gethook();
          capAtPos1.gethook();
          bottlePos5.gethook();
          enableRotaryTable.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      alignedSensor.setpreclear();
      capAtPos1.setpreclear();
      bottlePos5.setpreclear();
      enableRotaryTable.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos3E.setpreclear();
      bottleAtPos4E.setpreclear();
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      bottleAtPos1M.setpreclear();
      bottleAtPos2M.setpreclear();
      bottleAtPos3M.setpreclear();
      bottleAtPos4M.setpreclear();
      bottleAtPos5M.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAt2_1.setpreclear();
      bottleAt3_1.setpreclear();
      bottleAt4_1.setpreclear();
      bottleAt5_1.setpreclear();
      empty_1.setpreclear();
      rotaryOn_1.setpreclear();
      rotaryOff_1.setpreclear();
      bottlePos_1.setpreclear();
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
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = alignedSensor.getStatus() ? alignedSensor.setprepresent() : alignedSensor.setpreclear();
      alignedSensor.setpreval(alignedSensor.getValue());
      alignedSensor.setClear();
      dummyint = capAtPos1.getStatus() ? capAtPos1.setprepresent() : capAtPos1.setpreclear();
      capAtPos1.setpreval(capAtPos1.getValue());
      capAtPos1.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      dummyint = enableRotaryTable.getStatus() ? enableRotaryTable.setprepresent() : enableRotaryTable.setpreclear();
      enableRotaryTable.setpreval(enableRotaryTable.getValue());
      enableRotaryTable.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      tableAlignedWithSensorE.sethook();
      tableAlignedWithSensorE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      bottleAtPos1M.sethook();
      bottleAtPos1M.setClear();
      bottleAtPos2M.sethook();
      bottleAtPos2M.setClear();
      bottleAtPos3M.sethook();
      bottleAtPos3M.setClear();
      bottleAtPos4M.sethook();
      bottleAtPos4M.setClear();
      bottleAtPos5M.sethook();
      bottleAtPos5M.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAt2_1.setClear();
      bottleAt3_1.setClear();
      bottleAt4_1.setClear();
      bottleAt5_1.setClear();
      empty_1.setClear();
      rotaryOn_1.setClear();
      rotaryOff_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
        enable.gethook();
        refill.gethook();
        alignedSensor.gethook();
        capAtPos1.gethook();
        bottlePos5.gethook();
        enableRotaryTable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
