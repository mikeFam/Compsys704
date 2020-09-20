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
  private int bottlecount_thread_8;//sysj\plantRotaryTable.sysj line: 142, column: 3
  private int data_thread_6;//sysj\plantRotaryTable.sysj line: 68, column: 3
  private int S18497 = 1;
  private int S15907 = 1;
  private int S15824 = 1;
  private int S15948 = 1;
  private int S15917 = 1;
  private int S15989 = 1;
  private int S15958 = 1;
  private int S16030 = 1;
  private int S15999 = 1;
  private int S16185 = 1;
  private int S16081 = 1;
  private int S16055 = 1;
  private int S16054 = 1;
  private int S16053 = 1;
  private int S16052 = 1;
  private int S16352 = 1;
  private int S16240 = 1;
  private int S16186 = 1;
  private int S16414 = 1;
  private int S16357 = 1;
  private int S16480 = 1;
  private int S16422 = 1;
  private int S16430 = 1;
  private int S16438 = 1;
  private int S16446 = 1;
  private int S16454 = 1;
  private int S16462 = 1;
  private int S16470 = 1;
  private int S16478 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread18532(int [] tdone, int [] ends){
        switch(S16478){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 172, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 172, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread18531(int [] tdone, int [] ends){
        switch(S16470){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 170, column: 24
          bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 170, column: 38
          currsigs.addElement(bottleAtPos4E);
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

  public void thread18530(int [] tdone, int [] ends){
        switch(S16462){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 168, column: 24
          bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 168, column: 38
          currsigs.addElement(bottleAtPos3E);
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

  public void thread18529(int [] tdone, int [] ends){
        switch(S16454){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 166, column: 24
          bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 38
          currsigs.addElement(bottleAtPos2E);
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

  public void thread18528(int [] tdone, int [] ends){
        switch(S16446){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 164, column: 24
          bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 164, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread18527(int [] tdone, int [] ends){
        switch(S16438){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 162, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 162, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread18526(int [] tdone, int [] ends){
        switch(S16430){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 160, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 160, column: 38
          currsigs.addElement(bottleAtPos5E);
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

  public void thread18525(int [] tdone, int [] ends){
        switch(S16422){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 158, column: 24
          tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 158, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread18524(int [] tdone, int [] ends){
        switch(S16480){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread18525(tdone,ends);
        thread18526(tdone,ends);
        thread18527(tdone,ends);
        thread18528(tdone,ends);
        thread18529(tdone,ends);
        thread18530(tdone,ends);
        thread18531(tdone,ends);
        thread18532(tdone,ends);
        int biggest18533 = 0;
        if(ends[10]>=biggest18533){
          biggest18533=ends[10];
        }
        if(ends[11]>=biggest18533){
          biggest18533=ends[11];
        }
        if(ends[12]>=biggest18533){
          biggest18533=ends[12];
        }
        if(ends[13]>=biggest18533){
          biggest18533=ends[13];
        }
        if(ends[14]>=biggest18533){
          biggest18533=ends[14];
        }
        if(ends[15]>=biggest18533){
          biggest18533=ends[15];
        }
        if(ends[16]>=biggest18533){
          biggest18533=ends[16];
        }
        if(ends[17]>=biggest18533){
          biggest18533=ends[17];
        }
        if(biggest18533 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest18533 == 0){
          S16480=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread18523(int [] tdone, int [] ends){
        switch(S16414){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S16357){
          case 0 : 
            S16357=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 144, column: 12
              if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 145, column: 5
                bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 146, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S16357=1;
            S16357=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 144, column: 12
              if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 145, column: 5
                bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 146, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
                  currsigs.addElement(empty_1);
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16357=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18522(int [] tdone, int [] ends){
        switch(S16352){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S16240){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 109, column: 10
              S16240=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S16186){
                case 0 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 113, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 115, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantRotaryTable.sysj line: 115, column: 6
                    bottleAt2_1.setPresent();//sysj\plantRotaryTable.sysj line: 116, column: 6
                    currsigs.addElement(bottleAt2_1);
                    S16186=1;
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
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 117, column: 13
                    S16186=2;
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
                
                case 2 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos2.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 118, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 120, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantRotaryTable.sysj line: 120, column: 6
                    bottleAt3_1.setPresent();//sysj\plantRotaryTable.sysj line: 121, column: 6
                    currsigs.addElement(bottleAt3_1);
                    S16186=3;
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
                
                case 3 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 122, column: 13
                    S16186=4;
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
                
                case 4 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos3.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 123, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 125, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(3);//sysj\plantRotaryTable.sysj line: 125, column: 6
                    bottleAt4_1.setPresent();//sysj\plantRotaryTable.sysj line: 126, column: 6
                    currsigs.addElement(bottleAt4_1);
                    S16186=5;
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
                
                case 5 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 127, column: 13
                    S16186=6;
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
                
                case 6 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos4.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 128, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 130, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(4);//sysj\plantRotaryTable.sysj line: 130, column: 6
                    S16186=7;
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
                
                case 7 : 
                  S16186=7;
                  bottleAt5_1.setPresent();//sysj\plantRotaryTable.sysj line: 132, column: 6
                  currsigs.addElement(bottleAt5_1);
                  S16186=8;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                  break;
                
                case 8 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 133, column: 13
                    bottleDec_1.setPresent();//sysj\plantRotaryTable.sysj line: 134, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
                    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S16186=0;
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
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 137, column: 10
              S16240=0;
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
              bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
              currsigs.addElement(bottleAt1_1);
              S16186=0;
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
          
        }
        break;
      
    }
  }

  public void thread18521(int [] tdone, int [] ends){
        switch(S16185){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S16081){
          case 0 : 
            switch(S16055){
              case 0 : 
                if(bottleAt2_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 70, column: 11
                  S16081=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 71, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                switch(S16054){
                  case 0 : 
                    if(bottleAt3_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 75, column: 11
                      S16081=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 76, column: 6
                      currsigs.addElement(bottleAtPos2);
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S16053){
                      case 0 : 
                        if(bottleAt4_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 80, column: 11
                          S16081=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
                          currsigs.addElement(bottleAtPos3);
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        break;
                      
                      case 1 : 
                        switch(S16052){
                          case 0 : 
                            if(bottleAt5_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 85, column: 11
                              S16081=1;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 86, column: 6
                              currsigs.addElement(bottleAtPos4);
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            break;
                          
                          case 1 : 
                            if(bottleAt1_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 90, column: 11
                              S16081=1;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
                              currsigs.addElement(bottleAtPos5);
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            break;
                          
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S16081=1;
            data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 68, column: 3
            S16081=0;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 69, column: 7
              S16055=0;
              bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 71, column: 6
              currsigs.addElement(bottleAtPos1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S16055=1;
              if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 74, column: 12
                S16054=0;
                bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 76, column: 6
                currsigs.addElement(bottleAtPos2);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S16054=1;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 79, column: 12
                  S16053=0;
                  bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
                  currsigs.addElement(bottleAtPos3);
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S16053=1;
                  if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 84, column: 12
                    S16052=0;
                    bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 86, column: 6
                    currsigs.addElement(bottleAtPos4);
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S16052=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 89, column: 12
                      bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
                      currsigs.addElement(bottleAtPos5);
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S16081=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18520(int [] tdone, int [] ends){
        switch(S16030){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15999){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 58, column: 10
              S15999=1;
              if((!bottlePos5.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 59, column: 21
                S15999=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos5);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if((!bottlePos5.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 59, column: 21
              S15999=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 60, column: 5
              currsigs.addElement(bottleAtPos5);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 62, column: 10
              S15999=0;
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
        break;
      
    }
  }

  public void thread18519(int [] tdone, int [] ends){
        switch(S15989){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15958){
          case 0 : 
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 48, column: 10
              S15958=1;
              if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 49, column: 21
                S15958=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 50, column: 5
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
            if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 49, column: 21
              S15958=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 50, column: 5
              currsigs.addElement(capOnBottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 52, column: 10
              S15958=0;
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

  public void thread18518(int [] tdone, int [] ends){
        switch(S15948){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15917){
          case 0 : 
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 38, column: 10
              S15917=1;
              if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 39, column: 21
                S15917=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 40, column: 5
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
            if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 39, column: 21
              S15917=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 40, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 42, column: 10
              S15917=0;
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

  public void thread18517(int [] tdone, int [] ends){
        switch(S15907){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15824){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
              S15824=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 25, column: 5
              currsigs.addElement(rotaryOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 27, column: 10
              S15824=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 28, column: 20
                S15824=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOn");//sysj\plantRotaryTable.sysj line: 29, column: 5
                rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 30, column: 5
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
            if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 28, column: 20
              S15824=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 30, column: 5
              currsigs.addElement(rotaryOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 32, column: 10
              S15824=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
                S15824=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 24, column: 5
                rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 25, column: 5
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

  public void thread18514(int [] tdone, int [] ends){
        S16478=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 172, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 172, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread18513(int [] tdone, int [] ends){
        S16470=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 170, column: 24
      bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 170, column: 38
      currsigs.addElement(bottleAtPos4E);
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

  public void thread18512(int [] tdone, int [] ends){
        S16462=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 168, column: 24
      bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 168, column: 38
      currsigs.addElement(bottleAtPos3E);
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

  public void thread18511(int [] tdone, int [] ends){
        S16454=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 166, column: 24
      bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 38
      currsigs.addElement(bottleAtPos2E);
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

  public void thread18510(int [] tdone, int [] ends){
        S16446=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 164, column: 24
      bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 164, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread18509(int [] tdone, int [] ends){
        S16438=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 162, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 162, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread18508(int [] tdone, int [] ends){
        S16430=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 160, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 160, column: 38
      currsigs.addElement(bottleAtPos5E);
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

  public void thread18507(int [] tdone, int [] ends){
        S16422=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 158, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 158, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread18506(int [] tdone, int [] ends){
        S16480=1;
    thread18507(tdone,ends);
    thread18508(tdone,ends);
    thread18509(tdone,ends);
    thread18510(tdone,ends);
    thread18511(tdone,ends);
    thread18512(tdone,ends);
    thread18513(tdone,ends);
    thread18514(tdone,ends);
    int biggest18515 = 0;
    if(ends[10]>=biggest18515){
      biggest18515=ends[10];
    }
    if(ends[11]>=biggest18515){
      biggest18515=ends[11];
    }
    if(ends[12]>=biggest18515){
      biggest18515=ends[12];
    }
    if(ends[13]>=biggest18515){
      biggest18515=ends[13];
    }
    if(ends[14]>=biggest18515){
      biggest18515=ends[14];
    }
    if(ends[15]>=biggest18515){
      biggest18515=ends[15];
    }
    if(ends[16]>=biggest18515){
      biggest18515=ends[16];
    }
    if(ends[17]>=biggest18515){
      biggest18515=ends[17];
    }
    if(biggest18515 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread18505(int [] tdone, int [] ends){
        S16414=1;
    bottlecount_thread_8 = 10;//sysj\plantRotaryTable.sysj line: 142, column: 3
    S16357=0;
    if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 144, column: 12
      if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 145, column: 5
        bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 146, column: 6
      }
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
        bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
          currsigs.addElement(empty_1);
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
          currsigs.addElement(empty_1);
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 148, column: 12
        bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 149, column: 5
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
          currsigs.addElement(empty_1);
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 151, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 152, column: 4
          currsigs.addElement(empty_1);
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16357=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
  }

  public void thread18504(int [] tdone, int [] ends){
        S16352=1;
    S16240=0;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 111, column: 6
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
    currsigs.addElement(bottleAt1_1);
    S16186=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread18503(int [] tdone, int [] ends){
        S16185=1;
    data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 68, column: 3
    S16081=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 69, column: 7
      S16055=0;
      bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 71, column: 6
      currsigs.addElement(bottleAtPos1);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S16055=1;
      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 74, column: 12
        S16054=0;
        bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 76, column: 6
        currsigs.addElement(bottleAtPos2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        S16054=1;
        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 79, column: 12
          S16053=0;
          bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
          currsigs.addElement(bottleAtPos3);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          S16053=1;
          if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 84, column: 12
            S16052=0;
            bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 86, column: 6
            currsigs.addElement(bottleAtPos4);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            S16052=1;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 89, column: 12
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
              currsigs.addElement(bottleAtPos5);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S16081=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
      }
    }
  }

  public void thread18502(int [] tdone, int [] ends){
        S16030=1;
    S15999=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread18501(int [] tdone, int [] ends){
        S15989=1;
    S15958=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread18500(int [] tdone, int [] ends){
        S15948=1;
    S15917=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread18499(int [] tdone, int [] ends){
        S15907=1;
    S15824=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
      S15824=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 24, column: 5
      rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 25, column: 5
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
      switch(S18497){
        case 0 : 
          S18497=0;
          break RUN;
        
        case 1 : 
          S18497=2;
          S18497=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantRotaryTable.sysj line: 8, column: 1
            public void run() {//sysj\plantRotaryTable.sysj line: 10, column: 21
              org.compsys704.RotaryTable.main(null);//sysj\plantRotaryTable.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantRotaryTable.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantRotaryTable.sysj line: 14, column: 2
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 19, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 19, column: 2
          thread18499(tdone,ends);
          thread18500(tdone,ends);
          thread18501(tdone,ends);
          thread18502(tdone,ends);
          thread18503(tdone,ends);
          thread18504(tdone,ends);
          thread18505(tdone,ends);
          thread18506(tdone,ends);
          int biggest18516 = 0;
          if(ends[2]>=biggest18516){
            biggest18516=ends[2];
          }
          if(ends[3]>=biggest18516){
            biggest18516=ends[3];
          }
          if(ends[4]>=biggest18516){
            biggest18516=ends[4];
          }
          if(ends[5]>=biggest18516){
            biggest18516=ends[5];
          }
          if(ends[6]>=biggest18516){
            biggest18516=ends[6];
          }
          if(ends[7]>=biggest18516){
            biggest18516=ends[7];
          }
          if(ends[8]>=biggest18516){
            biggest18516=ends[8];
          }
          if(ends[9]>=biggest18516){
            biggest18516=ends[9];
          }
          if(biggest18516 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 16, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          thread18517(tdone,ends);
          thread18518(tdone,ends);
          thread18519(tdone,ends);
          thread18520(tdone,ends);
          thread18521(tdone,ends);
          thread18522(tdone,ends);
          thread18523(tdone,ends);
          thread18524(tdone,ends);
          int biggest18534 = 0;
          if(ends[2]>=biggest18534){
            biggest18534=ends[2];
          }
          if(ends[3]>=biggest18534){
            biggest18534=ends[3];
          }
          if(ends[4]>=biggest18534){
            biggest18534=ends[4];
          }
          if(ends[5]>=biggest18534){
            biggest18534=ends[5];
          }
          if(ends[6]>=biggest18534){
            biggest18534=ends[6];
          }
          if(ends[7]>=biggest18534){
            biggest18534=ends[7];
          }
          if(ends[8]>=biggest18534){
            biggest18534=ends[8];
          }
          if(ends[9]>=biggest18534){
            biggest18534=ends[9];
          }
          if(biggest18534 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest18534 == 0){
            S18497=0;
            active[1]=0;
            ends[1]=0;
            S18497=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
