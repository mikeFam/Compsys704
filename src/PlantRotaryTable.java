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
  public Signal bottleNumber = new Signal("bottleNumber", Signal.INPUT);
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
  public Signal jobDone = new Signal("jobDone", Signal.OUTPUT);
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
  private int bottlecount_thread_21;//sysj\plantRotaryTable.sysj line: 154, column: 3
  private int data_thread_5;//sysj\plantRotaryTable.sysj line: 59, column: 3
  private int S22684 = 1;
  private int S17590 = 1;
  private int S17539 = 1;
  private int S17631 = 1;
  private int S17600 = 1;
  private int S17672 = 1;
  private int S17641 = 1;
  private int S18509 = 1;
  private int S17675 = 1;
  private int S17756 = 1;
  private int S17755 = 1;
  private int S17680 = 1;
  private int S17685 = 1;
  private int S17754 = 1;
  private int S17691 = 1;
  private int S17696 = 1;
  private int S17701 = 1;
  private int S17753 = 1;
  private int S17707 = 1;
  private int S17712 = 1;
  private int S17717 = 1;
  private int S17752 = 1;
  private int S17723 = 1;
  private int S17728 = 1;
  private int S17733 = 1;
  private int S17739 = 1;
  private int S17744 = 1;
  private int S17749 = 1;
  private int S18676 = 1;
  private int S18564 = 1;
  private int S18510 = 1;
  private int S18750 = 1;
  private int S18678 = 1;
  private int S18816 = 1;
  private int S18758 = 1;
  private int S18766 = 1;
  private int S18774 = 1;
  private int S18782 = 1;
  private int S18790 = 1;
  private int S18798 = 1;
  private int S18806 = 1;
  private int S18814 = 1;
  
  private int[] ends = new int[31];
  private int[] tdone = new int[31];
  
  public void thread22755(int [] tdone, int [] ends){
        switch(S18814){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 186, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 186, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread22754(int [] tdone, int [] ends){
        switch(S18806){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 184, column: 24
          bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 184, column: 38
          currsigs.addElement(bottleAtPos4E);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread22753(int [] tdone, int [] ends){
        switch(S18798){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 182, column: 24
          bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 182, column: 38
          currsigs.addElement(bottleAtPos3E);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread22752(int [] tdone, int [] ends){
        switch(S18790){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 180, column: 24
          bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 180, column: 38
          currsigs.addElement(bottleAtPos2E);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread22751(int [] tdone, int [] ends){
        switch(S18782){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 178, column: 24
          bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 178, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread22750(int [] tdone, int [] ends){
        switch(S18774){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 176, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 176, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread22749(int [] tdone, int [] ends){
        switch(S18766){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 174, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 174, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread22748(int [] tdone, int [] ends){
        switch(S18758){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 172, column: 24
          tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 172, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread22747(int [] tdone, int [] ends){
        switch(S18816){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        thread22748(tdone,ends);
        thread22749(tdone,ends);
        thread22750(tdone,ends);
        thread22751(tdone,ends);
        thread22752(tdone,ends);
        thread22753(tdone,ends);
        thread22754(tdone,ends);
        thread22755(tdone,ends);
        int biggest22756 = 0;
        if(ends[23]>=biggest22756){
          biggest22756=ends[23];
        }
        if(ends[24]>=biggest22756){
          biggest22756=ends[24];
        }
        if(ends[25]>=biggest22756){
          biggest22756=ends[25];
        }
        if(ends[26]>=biggest22756){
          biggest22756=ends[26];
        }
        if(ends[27]>=biggest22756){
          biggest22756=ends[27];
        }
        if(ends[28]>=biggest22756){
          biggest22756=ends[28];
        }
        if(ends[29]>=biggest22756){
          biggest22756=ends[29];
        }
        if(ends[30]>=biggest22756){
          biggest22756=ends[30];
        }
        if(biggest22756 == 1){
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        //FINXME code
        if(biggest22756 == 0){
          S18816=0;
          active[22]=0;
          ends[22]=0;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread22746(int [] tdone, int [] ends){
        switch(S18750){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S18678){
          case 0 : 
            if(bottleNumber.getprestatus()){//sysj\plantRotaryTable.sysj line: 156, column: 11
              bottlecount_thread_21 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantRotaryTable.sysj line: 157, column: 4
              S18678=1;
              if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 158, column: 12
                if(bottlecount_thread_21 > 0) {//sysj\plantRotaryTable.sysj line: 159, column: 5
                  bottlecount_thread_21 = bottlecount_thread_21 - 1;//sysj\plantRotaryTable.sysj line: 160, column: 6
                }
                if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 162, column: 12
                  bottlecount_thread_21 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantRotaryTable.sysj line: 163, column: 5
                  if(bottlecount_thread_21 == 0){//sysj\plantRotaryTable.sysj line: 165, column: 7
                    empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 4
                    currsigs.addElement(empty_1);
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                  else {
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                else {
                  if(bottlecount_thread_21 == 0){//sysj\plantRotaryTable.sysj line: 165, column: 7
                    empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 4
                    currsigs.addElement(empty_1);
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                  else {
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
              }
              else {
                if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 162, column: 12
                  bottlecount_thread_21 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantRotaryTable.sysj line: 163, column: 5
                  if(bottlecount_thread_21 == 0){//sysj\plantRotaryTable.sysj line: 165, column: 7
                    empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 4
                    currsigs.addElement(empty_1);
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                  else {
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                else {
                  if(bottlecount_thread_21 == 0){//sysj\plantRotaryTable.sysj line: 165, column: 7
                    empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 166, column: 4
                    currsigs.addElement(empty_1);
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                  else {
                    S18678=2;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S18678=0;
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
            break;
          
          case 2 : 
            S18678=2;
            S18678=0;
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread22745(int [] tdone, int [] ends){
        switch(S18676){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S18564){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 121, column: 10
              S18564=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              switch(S18510){
                case 0 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 125, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 127, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantRotaryTable.sysj line: 127, column: 6
                    bottleAt2_1.setPresent();//sysj\plantRotaryTable.sysj line: 128, column: 6
                    currsigs.addElement(bottleAt2_1);
                    S18510=1;
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
                
                case 1 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 129, column: 13
                    S18510=2;
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
                
                case 2 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos2.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 130, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 132, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantRotaryTable.sysj line: 132, column: 6
                    bottleAt3_1.setPresent();//sysj\plantRotaryTable.sysj line: 133, column: 6
                    currsigs.addElement(bottleAt3_1);
                    S18510=3;
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
                
                case 3 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 134, column: 13
                    S18510=4;
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
                
                case 4 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos3.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 135, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 137, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(3);//sysj\plantRotaryTable.sysj line: 137, column: 6
                    bottleAt4_1.setPresent();//sysj\plantRotaryTable.sysj line: 138, column: 6
                    currsigs.addElement(bottleAt4_1);
                    S18510=5;
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
                
                case 5 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 139, column: 13
                    S18510=6;
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
                
                case 6 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos4.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 140, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 142, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(4);//sysj\plantRotaryTable.sysj line: 142, column: 6
                    S18510=7;
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
                
                case 7 : 
                  S18510=7;
                  bottleAt5_1.setPresent();//sysj\plantRotaryTable.sysj line: 144, column: 6
                  currsigs.addElement(bottleAt5_1);
                  S18510=8;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                  break;
                
                case 8 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 145, column: 13
                    bottleDec_1.setPresent();//sysj\plantRotaryTable.sysj line: 146, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 123, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 123, column: 6
                    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 124, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S18510=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 10
              S18564=0;
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 123, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 123, column: 6
              bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 124, column: 6
              currsigs.addElement(bottleAt1_1);
              S18510=0;
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
        break;
      
    }
  }

  public void thread22743(int [] tdone, int [] ends){
        switch(S17749){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 102, column: 8
        currsigs.addElement(bottleAtPos5M);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread22742(int [] tdone, int [] ends){
        switch(S17744){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 100, column: 8
        currsigs.addElement(jobDone);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread22741(int [] tdone, int [] ends){
        switch(S17739){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 98, column: 8
        currsigs.addElement(bottleAtPos5);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread22739(int [] tdone, int [] ends){
        switch(S17733){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 93, column: 8
        currsigs.addElement(bottleAtPos4M);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread22738(int [] tdone, int [] ends){
        switch(S17728){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 8
        currsigs.addElement(jobDone);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread22737(int [] tdone, int [] ends){
        switch(S17723){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 89, column: 8
        currsigs.addElement(bottleAtPos4);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread22735(int [] tdone, int [] ends){
        switch(S17717){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 84, column: 8
        currsigs.addElement(bottleAtPos3M);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread22734(int [] tdone, int [] ends){
        switch(S17712){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 82, column: 8
        currsigs.addElement(jobDone);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread22733(int [] tdone, int [] ends){
        switch(S17707){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 80, column: 8
        currsigs.addElement(bottleAtPos3);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread22731(int [] tdone, int [] ends){
        switch(S17701){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 75, column: 8
        currsigs.addElement(bottleAtPos2M);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread22730(int [] tdone, int [] ends){
        switch(S17696){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 73, column: 8
        currsigs.addElement(jobDone);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread22729(int [] tdone, int [] ends){
        switch(S17691){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 71, column: 8
        currsigs.addElement(bottleAtPos2);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread22727(int [] tdone, int [] ends){
        switch(S17685){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 66, column: 8
        currsigs.addElement(bottleAtPos1M);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread22726(int [] tdone, int [] ends){
        switch(S17680){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 64, column: 8
        currsigs.addElement(bottleAtPos1);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread22724(int [] tdone, int [] ends){
        S17749=1;
    bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 102, column: 8
    currsigs.addElement(bottleAtPos5M);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread22723(int [] tdone, int [] ends){
        S17744=1;
    jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 100, column: 8
    currsigs.addElement(jobDone);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread22722(int [] tdone, int [] ends){
        S17739=1;
    bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 98, column: 8
    currsigs.addElement(bottleAtPos5);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread22720(int [] tdone, int [] ends){
        S17733=1;
    bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 93, column: 8
    currsigs.addElement(bottleAtPos4M);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread22719(int [] tdone, int [] ends){
        S17728=1;
    jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 8
    currsigs.addElement(jobDone);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread22718(int [] tdone, int [] ends){
        S17723=1;
    bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 89, column: 8
    currsigs.addElement(bottleAtPos4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread22716(int [] tdone, int [] ends){
        S17717=1;
    bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 84, column: 8
    currsigs.addElement(bottleAtPos3M);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread22715(int [] tdone, int [] ends){
        S17712=1;
    jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 82, column: 8
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread22714(int [] tdone, int [] ends){
        S17707=1;
    bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 80, column: 8
    currsigs.addElement(bottleAtPos3);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread22712(int [] tdone, int [] ends){
        S17701=1;
    bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 75, column: 8
    currsigs.addElement(bottleAtPos2M);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread22711(int [] tdone, int [] ends){
        S17696=1;
    jobDone.setPresent();//sysj\plantRotaryTable.sysj line: 73, column: 8
    currsigs.addElement(jobDone);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread22710(int [] tdone, int [] ends){
        S17691=1;
    bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 71, column: 8
    currsigs.addElement(bottleAtPos2);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread22708(int [] tdone, int [] ends){
        S17685=1;
    bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 66, column: 8
    currsigs.addElement(bottleAtPos1M);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread22707(int [] tdone, int [] ends){
        S17680=1;
    bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 64, column: 8
    currsigs.addElement(bottleAtPos1);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread22706(int [] tdone, int [] ends){
        switch(S18509){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S17675){
          case 0 : 
            if(enableRotaryTable.getprestatus()){//sysj\plantRotaryTable.sysj line: 60, column: 10
              S17675=1;
              if((!enableRotaryTable.getprestatus())){//sysj\plantRotaryTable.sysj line: 61, column: 20
                data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 59, column: 3
                S17675=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S17756=0;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 62, column: 8
                  S17755=0;
                  thread22707(tdone,ends);
                  thread22708(tdone,ends);
                  int biggest22709 = 0;
                  if(ends[6]>=biggest22709){
                    biggest22709=ends[6];
                  }
                  if(ends[7]>=biggest22709){
                    biggest22709=ends[7];
                  }
                  if(biggest22709 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  S17755=1;
                  if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 69, column: 13
                    S17754=0;
                    thread22710(tdone,ends);
                    thread22711(tdone,ends);
                    thread22712(tdone,ends);
                    int biggest22713 = 0;
                    if(ends[8]>=biggest22713){
                      biggest22713=ends[8];
                    }
                    if(ends[9]>=biggest22713){
                      biggest22713=ends[9];
                    }
                    if(ends[10]>=biggest22713){
                      biggest22713=ends[10];
                    }
                    if(biggest22713 == 1){
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    S17754=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 78, column: 13
                      S17753=0;
                      thread22714(tdone,ends);
                      thread22715(tdone,ends);
                      thread22716(tdone,ends);
                      int biggest22717 = 0;
                      if(ends[11]>=biggest22717){
                        biggest22717=ends[11];
                      }
                      if(ends[12]>=biggest22717){
                        biggest22717=ends[12];
                      }
                      if(ends[13]>=biggest22717){
                        biggest22717=ends[13];
                      }
                      if(biggest22717 == 1){
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                    else {
                      S17753=1;
                      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 87, column: 13
                        S17752=0;
                        thread22718(tdone,ends);
                        thread22719(tdone,ends);
                        thread22720(tdone,ends);
                        int biggest22721 = 0;
                        if(ends[14]>=biggest22721){
                          biggest22721=ends[14];
                        }
                        if(ends[15]>=biggest22721){
                          biggest22721=ends[15];
                        }
                        if(ends[16]>=biggest22721){
                          biggest22721=ends[16];
                        }
                        if(biggest22721 == 1){
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        S17752=1;
                        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 96, column: 13
                          thread22722(tdone,ends);
                          thread22723(tdone,ends);
                          thread22724(tdone,ends);
                          int biggest22725 = 0;
                          if(ends[17]>=biggest22725){
                            biggest22725=ends[17];
                          }
                          if(ends[18]>=biggest22725){
                            biggest22725=ends[18];
                          }
                          if(ends[19]>=biggest22725){
                            biggest22725=ends[19];
                          }
                          if(biggest22725 == 1){
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                        else {
                          S17756=1;
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
            if((!enableRotaryTable.getprestatus())){//sysj\plantRotaryTable.sysj line: 61, column: 20
              data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 59, column: 3
              S17675=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S17756){
                case 0 : 
                  switch(S17755){
                    case 0 : 
                      if(bottleAt2_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 63, column: 12
                        S17756=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        thread22726(tdone,ends);
                        thread22727(tdone,ends);
                        int biggest22728 = 0;
                        if(ends[6]>=biggest22728){
                          biggest22728=ends[6];
                        }
                        if(ends[7]>=biggest22728){
                          biggest22728=ends[7];
                        }
                        if(biggest22728 == 1){
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        //FINXME code
                        if(biggest22728 == 0){
                          S17756=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      break;
                    
                    case 1 : 
                      switch(S17754){
                        case 0 : 
                          if(bottleAt3_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 70, column: 12
                            S17756=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            thread22729(tdone,ends);
                            thread22730(tdone,ends);
                            thread22731(tdone,ends);
                            int biggest22732 = 0;
                            if(ends[8]>=biggest22732){
                              biggest22732=ends[8];
                            }
                            if(ends[9]>=biggest22732){
                              biggest22732=ends[9];
                            }
                            if(ends[10]>=biggest22732){
                              biggest22732=ends[10];
                            }
                            if(biggest22732 == 1){
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            //FINXME code
                            if(biggest22732 == 0){
                              S17756=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          break;
                        
                        case 1 : 
                          switch(S17753){
                            case 0 : 
                              if(bottleAt4_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 79, column: 12
                                S17756=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                thread22733(tdone,ends);
                                thread22734(tdone,ends);
                                thread22735(tdone,ends);
                                int biggest22736 = 0;
                                if(ends[11]>=biggest22736){
                                  biggest22736=ends[11];
                                }
                                if(ends[12]>=biggest22736){
                                  biggest22736=ends[12];
                                }
                                if(ends[13]>=biggest22736){
                                  biggest22736=ends[13];
                                }
                                if(biggest22736 == 1){
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                //FINXME code
                                if(biggest22736 == 0){
                                  S17756=1;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                              }
                              break;
                            
                            case 1 : 
                              switch(S17752){
                                case 0 : 
                                  if(bottleAt5_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 88, column: 12
                                    S17756=1;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    thread22737(tdone,ends);
                                    thread22738(tdone,ends);
                                    thread22739(tdone,ends);
                                    int biggest22740 = 0;
                                    if(ends[14]>=biggest22740){
                                      biggest22740=ends[14];
                                    }
                                    if(ends[15]>=biggest22740){
                                      biggest22740=ends[15];
                                    }
                                    if(ends[16]>=biggest22740){
                                      biggest22740=ends[16];
                                    }
                                    if(biggest22740 == 1){
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    //FINXME code
                                    if(biggest22740 == 0){
                                      S17756=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                  break;
                                
                                case 1 : 
                                  if(bottleAt1_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 97, column: 12
                                    S17756=1;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    thread22741(tdone,ends);
                                    thread22742(tdone,ends);
                                    thread22743(tdone,ends);
                                    int biggest22744 = 0;
                                    if(ends[17]>=biggest22744){
                                      biggest22744=ends[17];
                                    }
                                    if(ends[18]>=biggest22744){
                                      biggest22744=ends[18];
                                    }
                                    if(ends[19]>=biggest22744){
                                      biggest22744=ends[19];
                                    }
                                    if(biggest22744 == 1){
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    //FINXME code
                                    if(biggest22744 == 0){
                                      S17756=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
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
                  S17756=1;
                  data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 59, column: 3
                  S17675=0;
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

  public void thread22705(int [] tdone, int [] ends){
        switch(S17672){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S17641){
          case 0 : 
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 49, column: 10
              S17641=1;
              if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 50, column: 21
                S17641=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 51, column: 5
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
            if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 50, column: 21
              S17641=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 51, column: 5
              currsigs.addElement(capOnBottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 53, column: 10
              S17641=0;
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

  public void thread22704(int [] tdone, int [] ends){
        switch(S17631){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S17600){
          case 0 : 
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 39, column: 10
              S17600=1;
              if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 40, column: 21
                S17600=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 41, column: 5
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
            if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 40, column: 21
              S17600=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 41, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 43, column: 10
              S17600=0;
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

  public void thread22703(int [] tdone, int [] ends){
        switch(S17590){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S17539){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 26, column: 21
              S17539=1;
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
              S17539=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 30, column: 20
                S17539=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 31, column: 5
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
              S17539=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOn_1.setPresent();//sysj\plantRotaryTable.sysj line: 31, column: 5
              currsigs.addElement(rotaryOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 33, column: 10
              S17539=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 26, column: 21
                S17539=1;
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

  public void thread22700(int [] tdone, int [] ends){
        S18814=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 186, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 186, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread22699(int [] tdone, int [] ends){
        S18806=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 184, column: 24
      bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 184, column: 38
      currsigs.addElement(bottleAtPos4E);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread22698(int [] tdone, int [] ends){
        S18798=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 182, column: 24
      bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 182, column: 38
      currsigs.addElement(bottleAtPos3E);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread22697(int [] tdone, int [] ends){
        S18790=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 180, column: 24
      bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 180, column: 38
      currsigs.addElement(bottleAtPos2E);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread22696(int [] tdone, int [] ends){
        S18782=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 178, column: 24
      bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 178, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread22695(int [] tdone, int [] ends){
        S18774=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 176, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 176, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread22694(int [] tdone, int [] ends){
        S18766=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 174, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 174, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread22693(int [] tdone, int [] ends){
        S18758=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 172, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 172, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread22692(int [] tdone, int [] ends){
        S18816=1;
    thread22693(tdone,ends);
    thread22694(tdone,ends);
    thread22695(tdone,ends);
    thread22696(tdone,ends);
    thread22697(tdone,ends);
    thread22698(tdone,ends);
    thread22699(tdone,ends);
    thread22700(tdone,ends);
    int biggest22701 = 0;
    if(ends[23]>=biggest22701){
      biggest22701=ends[23];
    }
    if(ends[24]>=biggest22701){
      biggest22701=ends[24];
    }
    if(ends[25]>=biggest22701){
      biggest22701=ends[25];
    }
    if(ends[26]>=biggest22701){
      biggest22701=ends[26];
    }
    if(ends[27]>=biggest22701){
      biggest22701=ends[27];
    }
    if(ends[28]>=biggest22701){
      biggest22701=ends[28];
    }
    if(ends[29]>=biggest22701){
      biggest22701=ends[29];
    }
    if(ends[30]>=biggest22701){
      biggest22701=ends[30];
    }
    if(biggest22701 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread22691(int [] tdone, int [] ends){
        S18750=1;
        S18678=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread22690(int [] tdone, int [] ends){
        S18676=1;
    S18564=0;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 123, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 123, column: 6
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 124, column: 6
    currsigs.addElement(bottleAt1_1);
    S18510=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread22689(int [] tdone, int [] ends){
        S18509=1;
    data_thread_5 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 59, column: 3
    S17675=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread22688(int [] tdone, int [] ends){
        S17672=1;
    S17641=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread22687(int [] tdone, int [] ends){
        S17631=1;
    S17600=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread22686(int [] tdone, int [] ends){
        S17590=1;
    S17539=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 26, column: 21
      S17539=1;
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
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S22684){
        case 0 : 
          S22684=0;
          break RUN;
        
        case 1 : 
          S22684=2;
          S22684=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantRotaryTable.sysj line: 11, column: 1
            public void run() {//sysj\plantRotaryTable.sysj line: 13, column: 21
              org.compsys704.RotaryTable.main(null);//sysj\plantRotaryTable.sysj line: 14, column: 4
            }
            GUI(){//sysj\plantRotaryTable.sysj line: 12, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 21, column: 2
          bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 22, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 22, column: 2
          thread22686(tdone,ends);
          thread22687(tdone,ends);
          thread22688(tdone,ends);
          thread22689(tdone,ends);
          thread22690(tdone,ends);
          thread22691(tdone,ends);
          thread22692(tdone,ends);
          int biggest22702 = 0;
          if(ends[2]>=biggest22702){
            biggest22702=ends[2];
          }
          if(ends[3]>=biggest22702){
            biggest22702=ends[3];
          }
          if(ends[4]>=biggest22702){
            biggest22702=ends[4];
          }
          if(ends[5]>=biggest22702){
            biggest22702=ends[5];
          }
          if(ends[20]>=biggest22702){
            biggest22702=ends[20];
          }
          if(ends[21]>=biggest22702){
            biggest22702=ends[21];
          }
          if(ends[22]>=biggest22702){
            biggest22702=ends[22];
          }
          if(biggest22702 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 20, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 21, column: 2
          thread22703(tdone,ends);
          thread22704(tdone,ends);
          thread22705(tdone,ends);
          thread22706(tdone,ends);
          thread22745(tdone,ends);
          thread22746(tdone,ends);
          thread22747(tdone,ends);
          int biggest22757 = 0;
          if(ends[2]>=biggest22757){
            biggest22757=ends[2];
          }
          if(ends[3]>=biggest22757){
            biggest22757=ends[3];
          }
          if(ends[4]>=biggest22757){
            biggest22757=ends[4];
          }
          if(ends[5]>=biggest22757){
            biggest22757=ends[5];
          }
          if(ends[20]>=biggest22757){
            biggest22757=ends[20];
          }
          if(ends[21]>=biggest22757){
            biggest22757=ends[21];
          }
          if(ends[22]>=biggest22757){
            biggest22757=ends[22];
          }
          if(biggest22757 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest22757 == 0){
            S22684=0;
            active[1]=0;
            ends[1]=0;
            S22684=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleNumber.gethook();
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
      bottleNumber.setpreclear();
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
      jobDone.setpreclear();
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
      dummyint = bottleNumber.getStatus() ? bottleNumber.setprepresent() : bottleNumber.setpreclear();
      bottleNumber.setpreval(bottleNumber.getValue());
      bottleNumber.setClear();
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
      jobDone.sethook();
      jobDone.setClear();
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
        bottleNumber.gethook();
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
