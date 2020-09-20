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
  private int bottlecount_thread_8;//sysj\plantRotaryTable.sysj line: 143, column: 3
  private int data_thread_6;//sysj\plantRotaryTable.sysj line: 69, column: 3
  private int S18501 = 1;
  private int S15743 = 1;
  private int S15660 = 1;
  private int S15784 = 1;
  private int S15753 = 1;
  private int S15825 = 1;
  private int S15794 = 1;
  private int S15866 = 1;
  private int S15835 = 1;
  private int S16021 = 1;
  private int S15917 = 1;
  private int S15891 = 1;
  private int S15890 = 1;
  private int S15889 = 1;
  private int S15888 = 1;
  private int S16188 = 1;
  private int S16076 = 1;
  private int S16022 = 1;
  private int S16250 = 1;
  private int S16193 = 1;
  private int S16316 = 1;
  private int S16258 = 1;
  private int S16266 = 1;
  private int S16274 = 1;
  private int S16282 = 1;
  private int S16290 = 1;
  private int S16298 = 1;
  private int S16306 = 1;
  private int S16314 = 1;
  private int S16358 = 1;
  private int S16324 = 1;
  private int S16332 = 1;
  private int S16340 = 1;
  private int S16348 = 1;
  private int S16356 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread18550(int [] tdone, int [] ends){
        switch(S16356){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 185, column: 24
          bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 185, column: 38
          currsigs.addElement(bottleAtPos5M);
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

  public void thread18549(int [] tdone, int [] ends){
        switch(S16348){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 24
          bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 183, column: 38
          currsigs.addElement(bottleAtPos4M);
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

  public void thread18548(int [] tdone, int [] ends){
        switch(S16340){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 181, column: 24
          bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 181, column: 38
          currsigs.addElement(bottleAtPos3M);
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

  public void thread18547(int [] tdone, int [] ends){
        switch(S16332){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 179, column: 24
          bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 179, column: 38
          currsigs.addElement(bottleAtPos2M);
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

  public void thread18546(int [] tdone, int [] ends){
        switch(S16324){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 177, column: 24
          bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 177, column: 38
          currsigs.addElement(bottleAtPos1M);
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

  public void thread18545(int [] tdone, int [] ends){
        switch(S16358){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread18546(tdone,ends);
        thread18547(tdone,ends);
        thread18548(tdone,ends);
        thread18549(tdone,ends);
        thread18550(tdone,ends);
        int biggest18551 = 0;
        if(ends[19]>=biggest18551){
          biggest18551=ends[19];
        }
        if(ends[20]>=biggest18551){
          biggest18551=ends[20];
        }
        if(ends[21]>=biggest18551){
          biggest18551=ends[21];
        }
        if(ends[22]>=biggest18551){
          biggest18551=ends[22];
        }
        if(ends[23]>=biggest18551){
          biggest18551=ends[23];
        }
        if(biggest18551 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest18551 == 0){
          S16358=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread18543(int [] tdone, int [] ends){
        switch(S16314){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 173, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 173, column: 38
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

  public void thread18542(int [] tdone, int [] ends){
        switch(S16306){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 171, column: 24
          bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 171, column: 38
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

  public void thread18541(int [] tdone, int [] ends){
        switch(S16298){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 169, column: 24
          bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 169, column: 38
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

  public void thread18540(int [] tdone, int [] ends){
        switch(S16290){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 167, column: 24
          bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 167, column: 38
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

  public void thread18539(int [] tdone, int [] ends){
        switch(S16282){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 165, column: 24
          bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 165, column: 38
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

  public void thread18538(int [] tdone, int [] ends){
        switch(S16274){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 163, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 163, column: 43
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

  public void thread18537(int [] tdone, int [] ends){
        switch(S16266){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 161, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 161, column: 38
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

  public void thread18536(int [] tdone, int [] ends){
        switch(S16258){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 159, column: 24
          tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 159, column: 48
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

  public void thread18535(int [] tdone, int [] ends){
        switch(S16316){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread18536(tdone,ends);
        thread18537(tdone,ends);
        thread18538(tdone,ends);
        thread18539(tdone,ends);
        thread18540(tdone,ends);
        thread18541(tdone,ends);
        thread18542(tdone,ends);
        thread18543(tdone,ends);
        int biggest18544 = 0;
        if(ends[10]>=biggest18544){
          biggest18544=ends[10];
        }
        if(ends[11]>=biggest18544){
          biggest18544=ends[11];
        }
        if(ends[12]>=biggest18544){
          biggest18544=ends[12];
        }
        if(ends[13]>=biggest18544){
          biggest18544=ends[13];
        }
        if(ends[14]>=biggest18544){
          biggest18544=ends[14];
        }
        if(ends[15]>=biggest18544){
          biggest18544=ends[15];
        }
        if(ends[16]>=biggest18544){
          biggest18544=ends[16];
        }
        if(ends[17]>=biggest18544){
          biggest18544=ends[17];
        }
        if(biggest18544 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest18544 == 0){
          S16316=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread18534(int [] tdone, int [] ends){
        switch(S16250){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S16193){
          case 0 : 
            S16193=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 145, column: 12
              if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 146, column: 5
                bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 147, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S16193=1;
            S16193=0;
            if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 145, column: 12
              if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 146, column: 5
                bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 147, column: 6
              }
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
                bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
                  empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
                  currsigs.addElement(empty_1);
                  S16193=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S16193=1;
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

  public void thread18533(int [] tdone, int [] ends){
        switch(S16188){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S16076){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 110, column: 10
              S16076=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S16022){
                case 0 : 
                  if(rotaryOn_1.getprestatus() && bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 114, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 116, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantRotaryTable.sysj line: 116, column: 6
                    bottleAt2_1.setPresent();//sysj\plantRotaryTable.sysj line: 117, column: 6
                    currsigs.addElement(bottleAt2_1);
                    S16022=1;
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
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 118, column: 13
                    S16022=2;
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
                  if(rotaryOn_1.getprestatus() && bottleAtPos2.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 119, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 121, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantRotaryTable.sysj line: 121, column: 6
                    bottleAt3_1.setPresent();//sysj\plantRotaryTable.sysj line: 122, column: 6
                    currsigs.addElement(bottleAt3_1);
                    S16022=3;
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
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 123, column: 13
                    S16022=4;
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
                  if(rotaryOn_1.getprestatus() && bottleAtPos3.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 124, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 126, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(3);//sysj\plantRotaryTable.sysj line: 126, column: 6
                    bottleAt4_1.setPresent();//sysj\plantRotaryTable.sysj line: 127, column: 6
                    currsigs.addElement(bottleAt4_1);
                    S16022=5;
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
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 128, column: 13
                    S16022=6;
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
                  if(rotaryOn_1.getprestatus() && bottleAtPos4.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 129, column: 12
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 131, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(4);//sysj\plantRotaryTable.sysj line: 131, column: 6
                    S16022=7;
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
                  S16022=7;
                  bottleAt5_1.setPresent();//sysj\plantRotaryTable.sysj line: 133, column: 6
                  currsigs.addElement(bottleAt5_1);
                  S16022=8;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                  break;
                
                case 8 : 
                  if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 134, column: 13
                    bottleDec_1.setPresent();//sysj\plantRotaryTable.sysj line: 135, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 112, column: 6
                    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 113, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S16022=0;
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
            if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 138, column: 10
              S16076=0;
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 112, column: 6
              bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 113, column: 6
              currsigs.addElement(bottleAt1_1);
              S16022=0;
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

  public void thread18532(int [] tdone, int [] ends){
        switch(S16021){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S15917){
          case 0 : 
            switch(S15891){
              case 0 : 
                if(bottleAt2_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 71, column: 11
                  S15917=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                switch(S15890){
                  case 0 : 
                    if(bottleAt3_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 76, column: 11
                      S15917=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 77, column: 6
                      currsigs.addElement(bottleAtPos2);
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S15889){
                      case 0 : 
                        if(bottleAt4_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 81, column: 11
                          S15917=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 82, column: 6
                          currsigs.addElement(bottleAtPos3);
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        break;
                      
                      case 1 : 
                        switch(S15888){
                          case 0 : 
                            if(bottleAt5_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 86, column: 11
                              S15917=1;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 87, column: 6
                              currsigs.addElement(bottleAtPos4);
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            break;
                          
                          case 1 : 
                            if(bottleAt1_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 91, column: 11
                              S15917=1;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 92, column: 6
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
            S15917=1;
            data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 69, column: 3
            S15917=0;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 70, column: 7
              S15891=0;
              bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 6
              currsigs.addElement(bottleAtPos1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S15891=1;
              if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 75, column: 12
                S15890=0;
                bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 77, column: 6
                currsigs.addElement(bottleAtPos2);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S15890=1;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 80, column: 12
                  S15889=0;
                  bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 82, column: 6
                  currsigs.addElement(bottleAtPos3);
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S15889=1;
                  if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 85, column: 12
                    S15888=0;
                    bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 87, column: 6
                    currsigs.addElement(bottleAtPos4);
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S15888=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 90, column: 12
                      bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 92, column: 6
                      currsigs.addElement(bottleAtPos5);
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S15917=1;
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

  public void thread18531(int [] tdone, int [] ends){
        switch(S15866){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15835){
          case 0 : 
            if(bottlePos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 59, column: 10
              S15835=1;
              if((!bottlePos5.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 60, column: 21
                S15835=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 61, column: 5
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
            if((!bottlePos5.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 60, column: 21
              S15835=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 61, column: 5
              currsigs.addElement(bottleAtPos5);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 63, column: 10
              S15835=0;
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

  public void thread18530(int [] tdone, int [] ends){
        switch(S15825){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15794){
          case 0 : 
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 49, column: 10
              S15794=1;
              if((!capAtPos1.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 50, column: 21
                S15794=2;
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
              S15794=2;
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
              S15794=0;
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

  public void thread18529(int [] tdone, int [] ends){
        switch(S15784){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15753){
          case 0 : 
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 39, column: 10
              S15753=1;
              if((!alignedSensor.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 40, column: 21
                S15753=2;
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
              S15753=2;
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
              S15753=0;
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

  public void thread18528(int [] tdone, int [] ends){
        switch(S15743){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15660){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 24, column: 21
              S15660=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 26, column: 5
              currsigs.addElement(rotaryOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 28, column: 10
              S15660=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 29, column: 20
                S15660=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOn");//sysj\plantRotaryTable.sysj line: 30, column: 5
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
            if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 29, column: 20
              S15660=3;
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
              S15660=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 24, column: 21
                S15660=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 25, column: 5
                rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 26, column: 5
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

  public void thread18525(int [] tdone, int [] ends){
        S16356=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 185, column: 24
      bottleAtPos5M.setPresent();//sysj\plantRotaryTable.sysj line: 185, column: 38
      currsigs.addElement(bottleAtPos5M);
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

  public void thread18524(int [] tdone, int [] ends){
        S16348=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 24
      bottleAtPos4M.setPresent();//sysj\plantRotaryTable.sysj line: 183, column: 38
      currsigs.addElement(bottleAtPos4M);
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

  public void thread18523(int [] tdone, int [] ends){
        S16340=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 181, column: 24
      bottleAtPos3M.setPresent();//sysj\plantRotaryTable.sysj line: 181, column: 38
      currsigs.addElement(bottleAtPos3M);
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

  public void thread18522(int [] tdone, int [] ends){
        S16332=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 179, column: 24
      bottleAtPos2M.setPresent();//sysj\plantRotaryTable.sysj line: 179, column: 38
      currsigs.addElement(bottleAtPos2M);
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

  public void thread18521(int [] tdone, int [] ends){
        S16324=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 177, column: 24
      bottleAtPos1M.setPresent();//sysj\plantRotaryTable.sysj line: 177, column: 38
      currsigs.addElement(bottleAtPos1M);
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

  public void thread18520(int [] tdone, int [] ends){
        S16358=1;
    thread18521(tdone,ends);
    thread18522(tdone,ends);
    thread18523(tdone,ends);
    thread18524(tdone,ends);
    thread18525(tdone,ends);
    int biggest18526 = 0;
    if(ends[19]>=biggest18526){
      biggest18526=ends[19];
    }
    if(ends[20]>=biggest18526){
      biggest18526=ends[20];
    }
    if(ends[21]>=biggest18526){
      biggest18526=ends[21];
    }
    if(ends[22]>=biggest18526){
      biggest18526=ends[22];
    }
    if(ends[23]>=biggest18526){
      biggest18526=ends[23];
    }
    if(biggest18526 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread18518(int [] tdone, int [] ends){
        S16314=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 173, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 173, column: 38
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

  public void thread18517(int [] tdone, int [] ends){
        S16306=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 171, column: 24
      bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 171, column: 38
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

  public void thread18516(int [] tdone, int [] ends){
        S16298=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 169, column: 24
      bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 169, column: 38
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

  public void thread18515(int [] tdone, int [] ends){
        S16290=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 167, column: 24
      bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 167, column: 38
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

  public void thread18514(int [] tdone, int [] ends){
        S16282=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 165, column: 24
      bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 165, column: 38
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

  public void thread18513(int [] tdone, int [] ends){
        S16274=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 163, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 163, column: 43
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

  public void thread18512(int [] tdone, int [] ends){
        S16266=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 161, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 161, column: 38
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

  public void thread18511(int [] tdone, int [] ends){
        S16258=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 159, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 159, column: 48
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

  public void thread18510(int [] tdone, int [] ends){
        S16316=1;
    thread18511(tdone,ends);
    thread18512(tdone,ends);
    thread18513(tdone,ends);
    thread18514(tdone,ends);
    thread18515(tdone,ends);
    thread18516(tdone,ends);
    thread18517(tdone,ends);
    thread18518(tdone,ends);
    int biggest18519 = 0;
    if(ends[10]>=biggest18519){
      biggest18519=ends[10];
    }
    if(ends[11]>=biggest18519){
      biggest18519=ends[11];
    }
    if(ends[12]>=biggest18519){
      biggest18519=ends[12];
    }
    if(ends[13]>=biggest18519){
      biggest18519=ends[13];
    }
    if(ends[14]>=biggest18519){
      biggest18519=ends[14];
    }
    if(ends[15]>=biggest18519){
      biggest18519=ends[15];
    }
    if(ends[16]>=biggest18519){
      biggest18519=ends[16];
    }
    if(ends[17]>=biggest18519){
      biggest18519=ends[17];
    }
    if(biggest18519 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread18509(int [] tdone, int [] ends){
        S16250=1;
    bottlecount_thread_8 = 10;//sysj\plantRotaryTable.sysj line: 143, column: 3
    S16193=0;
    if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 145, column: 12
      if(bottlecount_thread_8 > 0) {//sysj\plantRotaryTable.sysj line: 146, column: 5
        bottlecount_thread_8 = bottlecount_thread_8 - 1;//sysj\plantRotaryTable.sysj line: 147, column: 6
      }
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
        bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
          currsigs.addElement(empty_1);
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
          currsigs.addElement(empty_1);
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 149, column: 12
        bottlecount_thread_8 = 5;//sysj\plantRotaryTable.sysj line: 150, column: 5
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
          currsigs.addElement(empty_1);
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        if(bottlecount_thread_8 == 0){//sysj\plantRotaryTable.sysj line: 152, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 153, column: 4
          currsigs.addElement(empty_1);
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          S16193=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
  }

  public void thread18508(int [] tdone, int [] ends){
        S16188=1;
    S16076=0;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 112, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 112, column: 6
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 113, column: 6
    currsigs.addElement(bottleAt1_1);
    S16022=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread18507(int [] tdone, int [] ends){
        S16021=1;
    data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 69, column: 3
    S15917=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 70, column: 7
      S15891=0;
      bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 72, column: 6
      currsigs.addElement(bottleAtPos1);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S15891=1;
      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 75, column: 12
        S15890=0;
        bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 77, column: 6
        currsigs.addElement(bottleAtPos2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        S15890=1;
        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 80, column: 12
          S15889=0;
          bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 82, column: 6
          currsigs.addElement(bottleAtPos3);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          S15889=1;
          if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 85, column: 12
            S15888=0;
            bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 87, column: 6
            currsigs.addElement(bottleAtPos4);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            S15888=1;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 90, column: 12
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 92, column: 6
              currsigs.addElement(bottleAtPos5);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S15917=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
      }
    }
  }

  public void thread18506(int [] tdone, int [] ends){
        S15866=1;
    S15835=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread18505(int [] tdone, int [] ends){
        S15825=1;
    S15794=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread18504(int [] tdone, int [] ends){
        S15784=1;
    S15753=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread18503(int [] tdone, int [] ends){
        S15743=1;
    S15660=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 24, column: 21
      S15660=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("rotaryOff");//sysj\plantRotaryTable.sysj line: 25, column: 5
      rotaryOff_1.setPresent();//sysj\plantRotaryTable.sysj line: 26, column: 5
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
      switch(S18501){
        case 0 : 
          S18501=0;
          break RUN;
        
        case 1 : 
          S18501=2;
          S18501=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantRotaryTable.sysj line: 9, column: 1
            public void run() {//sysj\plantRotaryTable.sysj line: 11, column: 21
              org.compsys704.RotaryTable.main(null);//sysj\plantRotaryTable.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantRotaryTable.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantRotaryTable.sysj line: 15, column: 2
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 20, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 20, column: 2
          thread18503(tdone,ends);
          thread18504(tdone,ends);
          thread18505(tdone,ends);
          thread18506(tdone,ends);
          thread18507(tdone,ends);
          thread18508(tdone,ends);
          thread18509(tdone,ends);
          thread18510(tdone,ends);
          thread18520(tdone,ends);
          int biggest18527 = 0;
          if(ends[2]>=biggest18527){
            biggest18527=ends[2];
          }
          if(ends[3]>=biggest18527){
            biggest18527=ends[3];
          }
          if(ends[4]>=biggest18527){
            biggest18527=ends[4];
          }
          if(ends[5]>=biggest18527){
            biggest18527=ends[5];
          }
          if(ends[6]>=biggest18527){
            biggest18527=ends[6];
          }
          if(ends[7]>=biggest18527){
            biggest18527=ends[7];
          }
          if(ends[8]>=biggest18527){
            biggest18527=ends[8];
          }
          if(ends[9]>=biggest18527){
            biggest18527=ends[9];
          }
          if(ends[18]>=biggest18527){
            biggest18527=ends[18];
          }
          if(biggest18527 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt1_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt2_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt3_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt4_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          bottleAt5_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          empty_1.setClear();//sysj\plantRotaryTable.sysj line: 17, column: 2
          rotaryOn_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          rotaryOff_1.setClear();//sysj\plantRotaryTable.sysj line: 18, column: 2
          bottlePos_1.setClear();//sysj\plantRotaryTable.sysj line: 19, column: 2
          thread18528(tdone,ends);
          thread18529(tdone,ends);
          thread18530(tdone,ends);
          thread18531(tdone,ends);
          thread18532(tdone,ends);
          thread18533(tdone,ends);
          thread18534(tdone,ends);
          thread18535(tdone,ends);
          thread18545(tdone,ends);
          int biggest18552 = 0;
          if(ends[2]>=biggest18552){
            biggest18552=ends[2];
          }
          if(ends[3]>=biggest18552){
            biggest18552=ends[3];
          }
          if(ends[4]>=biggest18552){
            biggest18552=ends[4];
          }
          if(ends[5]>=biggest18552){
            biggest18552=ends[5];
          }
          if(ends[6]>=biggest18552){
            biggest18552=ends[6];
          }
          if(ends[7]>=biggest18552){
            biggest18552=ends[7];
          }
          if(ends[8]>=biggest18552){
            biggest18552=ends[8];
          }
          if(ends[9]>=biggest18552){
            biggest18552=ends[9];
          }
          if(ends[18]>=biggest18552){
            biggest18552=ends[18];
          }
          if(biggest18552 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest18552 == 0){
            S18501=0;
            active[1]=0;
            ends[1]=0;
            S18501=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
