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
  private int bottlecount_thread_18;//sysj\plantRotaryTable.sysj line: 181, column: 3
  private int data_thread_6;//sysj\plantRotaryTable.sysj line: 77, column: 3
  private int S19523 = 1;
  private int S15673 = 1;
  private int S15590 = 1;
  private int S15741 = 1;
  private int S15677 = 1;
  private int S15809 = 1;
  private int S15745 = 1;
  private int S15877 = 1;
  private int S15813 = 1;
  private int S16212 = 1;
  private int S15888 = 1;
  private int S15887 = 1;
  private int S15899 = 1;
  private int S15898 = 1;
  private int S15910 = 1;
  private int S15909 = 1;
  private int S15921 = 1;
  private int S15920 = 1;
  private int S15932 = 1;
  private int S15931 = 1;
  private int S16433 = 1;
  private int S16285 = 1;
  private int S16214 = 1;
  private int S16213 = 1;
  private int S16219 = 1;
  private int S16216 = 1;
  private int S16224 = 1;
  private int S16221 = 1;
  private int S16229 = 1;
  private int S16226 = 1;
  private int S16234 = 1;
  private int S16231 = 1;
  private int S16495 = 1;
  private int S16561 = 1;
  private int S16503 = 1;
  private int S16511 = 1;
  private int S16519 = 1;
  private int S16527 = 1;
  private int S16535 = 1;
  private int S16543 = 1;
  private int S16551 = 1;
  private int S16559 = 1;
  
  private int[] ends = new int[28];
  private int[] tdone = new int[28];
  
  public void thread19600(int [] tdone, int [] ends){
        switch(S16559){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 211, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 211, column: 38
          currsigs.addElement(bottleAtPos5E);
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

  public void thread19599(int [] tdone, int [] ends){
        switch(S16551){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 209, column: 24
          bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 209, column: 38
          currsigs.addElement(bottleAtPos4E);
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

  public void thread19598(int [] tdone, int [] ends){
        switch(S16543){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 207, column: 24
          bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 207, column: 38
          currsigs.addElement(bottleAtPos3E);
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

  public void thread19597(int [] tdone, int [] ends){
        switch(S16535){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 205, column: 24
          bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 205, column: 38
          currsigs.addElement(bottleAtPos2E);
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

  public void thread19596(int [] tdone, int [] ends){
        switch(S16527){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 203, column: 24
          bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 203, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread19595(int [] tdone, int [] ends){
        switch(S16519){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 201, column: 24
          capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 201, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread19594(int [] tdone, int [] ends){
        switch(S16511){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 199, column: 24
          bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 199, column: 38
          currsigs.addElement(bottleAtPos5E);
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

  public void thread19593(int [] tdone, int [] ends){
        switch(S16503){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 197, column: 24
          tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 197, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread19592(int [] tdone, int [] ends){
        switch(S16561){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        thread19593(tdone,ends);
        thread19594(tdone,ends);
        thread19595(tdone,ends);
        thread19596(tdone,ends);
        thread19597(tdone,ends);
        thread19598(tdone,ends);
        thread19599(tdone,ends);
        thread19600(tdone,ends);
        int biggest19601 = 0;
        if(ends[20]>=biggest19601){
          biggest19601=ends[20];
        }
        if(ends[21]>=biggest19601){
          biggest19601=ends[21];
        }
        if(ends[22]>=biggest19601){
          biggest19601=ends[22];
        }
        if(ends[23]>=biggest19601){
          biggest19601=ends[23];
        }
        if(ends[24]>=biggest19601){
          biggest19601=ends[24];
        }
        if(ends[25]>=biggest19601){
          biggest19601=ends[25];
        }
        if(ends[26]>=biggest19601){
          biggest19601=ends[26];
        }
        if(ends[27]>=biggest19601){
          biggest19601=ends[27];
        }
        if(biggest19601 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest19601 == 0){
          S16561=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread19591(int [] tdone, int [] ends){
        switch(S16495){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 12
          if(bottlecount_thread_18 > 0) {//sysj\plantRotaryTable.sysj line: 184, column: 5
            bottlecount_thread_18 = bottlecount_thread_18 - 1;//sysj\plantRotaryTable.sysj line: 185, column: 6
          }
          if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 12
            bottlecount_thread_18 = 5;//sysj\plantRotaryTable.sysj line: 188, column: 5
            if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
              empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
              currsigs.addElement(empty_1);
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
          else {
            if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
              empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
              currsigs.addElement(empty_1);
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
        }
        else {
          if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 12
            bottlecount_thread_18 = 5;//sysj\plantRotaryTable.sysj line: 188, column: 5
            if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
              empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
              currsigs.addElement(empty_1);
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
          else {
            if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
              empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
              currsigs.addElement(empty_1);
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
        }
        break;
      
    }
  }

  public void thread19589(int [] tdone, int [] ends){
        S16234=1;
    S16231=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread19588(int [] tdone, int [] ends){
        S16229=1;
    S16226=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread19587(int [] tdone, int [] ends){
        S16224=1;
    S16221=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread19586(int [] tdone, int [] ends){
        S16219=1;
    S16216=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread19585(int [] tdone, int [] ends){
        S16214=1;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 142, column: 8
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 142, column: 8
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 143, column: 6
    currsigs.addElement(bottleAt1_1);
    S16214=0;
    active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread19583(int [] tdone, int [] ends){
        S16234=1;
    S16231=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread19582(int [] tdone, int [] ends){
        S16229=1;
    S16226=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread19581(int [] tdone, int [] ends){
        S16224=1;
    S16221=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread19580(int [] tdone, int [] ends){
        S16219=1;
    S16216=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread19579(int [] tdone, int [] ends){
        S16214=1;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 142, column: 8
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 142, column: 8
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 143, column: 6
    currsigs.addElement(bottleAt1_1);
    S16214=0;
    active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread19577(int [] tdone, int [] ends){
        switch(S16234){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S16231){
          case 0 : 
            if(rotaryOn_1.getprestatus() && bottleAt4_1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 167, column: 13
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 169, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(4);//sysj\plantRotaryTable.sysj line: 169, column: 6
              bottleAt5_1.setPresent();//sysj\plantRotaryTable.sysj line: 170, column: 6
              currsigs.addElement(bottleAt5_1);
              S16231=1;
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 171, column: 13
              S16234=0;
              active[17]=0;
              ends[17]=0;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19576(int [] tdone, int [] ends){
        switch(S16229){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S16226){
          case 0 : 
            if(rotaryOn_1.getprestatus() && bottleAt3_1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 160, column: 13
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 162, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(3);//sysj\plantRotaryTable.sysj line: 162, column: 6
              bottleAt4_1.setPresent();//sysj\plantRotaryTable.sysj line: 163, column: 6
              currsigs.addElement(bottleAt4_1);
              S16226=1;
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 164, column: 13
              S16229=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19575(int [] tdone, int [] ends){
        switch(S16224){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S16221){
          case 0 : 
            if(rotaryOn_1.getprestatus() && bottleAt2_1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 153, column: 13
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 155, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(2);//sysj\plantRotaryTable.sysj line: 155, column: 6
              bottleAt3_1.setPresent();//sysj\plantRotaryTable.sysj line: 156, column: 6
              currsigs.addElement(bottleAt3_1);
              S16221=1;
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 157, column: 13
              S16224=0;
              active[15]=0;
              ends[15]=0;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19574(int [] tdone, int [] ends){
        switch(S16219){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S16216){
          case 0 : 
            if(rotaryOn_1.getprestatus() && bottleAt1_1.getprestatus() && enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 146, column: 13
              bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 148, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(1);//sysj\plantRotaryTable.sysj line: 148, column: 6
              bottleAt2_1.setPresent();//sysj\plantRotaryTable.sysj line: 149, column: 6
              currsigs.addElement(bottleAt2_1);
              S16216=1;
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 150, column: 13
              S16219=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19573(int [] tdone, int [] ends){
        switch(S16214){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S16213){
        }
        break;
      
    }
  }

  public void thread19572(int [] tdone, int [] ends){
        switch(S16433){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S16285){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 140, column: 10
              S16285=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              thread19573(tdone,ends);
              thread19574(tdone,ends);
              thread19575(tdone,ends);
              thread19576(tdone,ends);
              thread19577(tdone,ends);
              int biggest19578 = 0;
              if(ends[13]>=biggest19578){
                biggest19578=ends[13];
              }
              if(ends[14]>=biggest19578){
                biggest19578=ends[14];
              }
              if(ends[15]>=biggest19578){
                biggest19578=ends[15];
              }
              if(ends[16]>=biggest19578){
                biggest19578=ends[16];
              }
              if(ends[17]>=biggest19578){
                biggest19578=ends[17];
              }
              if(biggest19578 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              //FINXME code
              if(biggest19578 == 0){
                bottleDec_1.setPresent();//sysj\plantRotaryTable.sysj line: 173, column: 6
                currsigs.addElement(bottleDec_1);
                thread19579(tdone,ends);
                thread19580(tdone,ends);
                thread19581(tdone,ends);
                thread19582(tdone,ends);
                thread19583(tdone,ends);
                int biggest19584 = 0;
                if(ends[13]>=biggest19584){
                  biggest19584=ends[13];
                }
                if(ends[14]>=biggest19584){
                  biggest19584=ends[14];
                }
                if(ends[15]>=biggest19584){
                  biggest19584=ends[15];
                }
                if(ends[16]>=biggest19584){
                  biggest19584=ends[16];
                }
                if(ends[17]>=biggest19584){
                  biggest19584=ends[17];
                }
                if(biggest19584 == 1){
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 176, column: 10
              S16285=0;
              thread19585(tdone,ends);
              thread19586(tdone,ends);
              thread19587(tdone,ends);
              thread19588(tdone,ends);
              thread19589(tdone,ends);
              int biggest19590 = 0;
              if(ends[13]>=biggest19590){
                biggest19590=ends[13];
              }
              if(ends[14]>=biggest19590){
                biggest19590=ends[14];
              }
              if(ends[15]>=biggest19590){
                biggest19590=ends[15];
              }
              if(ends[16]>=biggest19590){
                biggest19590=ends[16];
              }
              if(ends[17]>=biggest19590){
                biggest19590=ends[17];
              }
              if(biggest19590 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19570(int [] tdone, int [] ends){
        S15932=1;
    S15931=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 118, column: 7
      System.out.println("bottleLeftPos5");//sysj\plantRotaryTable.sysj line: 120, column: 6
      bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 121, column: 6
      currsigs.addElement(bottleAtPos5);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S15931=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread19569(int [] tdone, int [] ends){
        S15921=1;
    S15920=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 108, column: 7
      System.out.println("bottleLeftPos4");//sysj\plantRotaryTable.sysj line: 110, column: 6
      bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
      currsigs.addElement(bottleAtPos4);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S15920=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread19568(int [] tdone, int [] ends){
        S15910=1;
    S15909=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 98, column: 7
      System.out.println("bottleLeftPos3");//sysj\plantRotaryTable.sysj line: 100, column: 6
      bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 101, column: 6
      currsigs.addElement(bottleAtPos3);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S15909=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread19567(int [] tdone, int [] ends){
        S15899=1;
    S15898=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 88, column: 7
      System.out.println("bottleAtPos2");//sysj\plantRotaryTable.sysj line: 90, column: 6
      bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
      currsigs.addElement(bottleAtPos2);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S15898=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread19566(int [] tdone, int [] ends){
        S15888=1;
    S15887=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 78, column: 8
      System.out.println("bottleAt1");//sysj\plantRotaryTable.sysj line: 80, column: 6
      bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
      currsigs.addElement(bottleAtPos1);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15887=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread19564(int [] tdone, int [] ends){
        switch(S15932){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S15931){
          case 0 : 
            if(bottleAt1_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 119, column: 11
              S15931=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 121, column: 6
              currsigs.addElement(bottleAtPos5);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S15931=1;
            S15932=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19563(int [] tdone, int [] ends){
        switch(S15921){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S15920){
          case 0 : 
            if(bottleAt5_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 109, column: 11
              S15920=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
              currsigs.addElement(bottleAtPos4);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S15920=1;
            S15921=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19562(int [] tdone, int [] ends){
        switch(S15910){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S15909){
          case 0 : 
            if(bottleAt4_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 99, column: 11
              S15909=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 101, column: 6
              currsigs.addElement(bottleAtPos3);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S15909=1;
            S15910=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19561(int [] tdone, int [] ends){
        switch(S15899){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S15898){
          case 0 : 
            if(bottleAt3_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 89, column: 11
              S15898=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
              currsigs.addElement(bottleAtPos2);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S15898=1;
            S15899=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19560(int [] tdone, int [] ends){
        switch(S15888){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S15887){
          case 0 : 
            if(bottleAt2_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 79, column: 11
              S15887=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
              currsigs.addElement(bottleAtPos1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S15887=1;
            S15888=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19559(int [] tdone, int [] ends){
        switch(S16212){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread19560(tdone,ends);
        thread19561(tdone,ends);
        thread19562(tdone,ends);
        thread19563(tdone,ends);
        thread19564(tdone,ends);
        int biggest19565 = 0;
        if(ends[7]>=biggest19565){
          biggest19565=ends[7];
        }
        if(ends[8]>=biggest19565){
          biggest19565=ends[8];
        }
        if(ends[9]>=biggest19565){
          biggest19565=ends[9];
        }
        if(ends[10]>=biggest19565){
          biggest19565=ends[10];
        }
        if(ends[11]>=biggest19565){
          biggest19565=ends[11];
        }
        if(biggest19565 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest19565 == 0){
          data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 77, column: 3
          thread19566(tdone,ends);
          thread19567(tdone,ends);
          thread19568(tdone,ends);
          thread19569(tdone,ends);
          thread19570(tdone,ends);
          int biggest19571 = 0;
          if(ends[7]>=biggest19571){
            biggest19571=ends[7];
          }
          if(ends[8]>=biggest19571){
            biggest19571=ends[8];
          }
          if(ends[9]>=biggest19571){
            biggest19571=ends[9];
          }
          if(ends[10]>=biggest19571){
            biggest19571=ends[10];
          }
          if(ends[11]>=biggest19571){
            biggest19571=ends[11];
          }
          if(biggest19571 == 1){
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread19558(int [] tdone, int [] ends){
        switch(S15877){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15813){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 64, column: 10
              S15813=1;
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
            if(bottlePos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 65, column: 10
              S15813=2;
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
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 66, column: 10
              S15813=3;
              System.out.println("bottleAtPos5");//sysj\plantRotaryTable.sysj line: 68, column: 5
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 5
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
            if(!bottlePos5.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 67, column: 11
              System.out.println("Not-bottleAtPos5");//sysj\plantRotaryTable.sysj line: 71, column: 4
              S15813=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 69, column: 5
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

  public void thread19557(int [] tdone, int [] ends){
        switch(S15809){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15745){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 51, column: 10
              S15745=1;
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
            if(capAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 52, column: 10
              S15745=2;
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
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 53, column: 10
              S15745=3;
              System.out.println("capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 55, column: 5
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 56, column: 5
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
            if(!capAtPos1.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 54, column: 11
              System.out.println("Not-capOnBottleAtPos1");//sysj\plantRotaryTable.sysj line: 58, column: 4
              S15745=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 56, column: 5
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

  public void thread19556(int [] tdone, int [] ends){
        switch(S15741){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15677){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\plantRotaryTable.sysj line: 38, column: 10
              S15677=1;
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
            if(alignedSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 39, column: 10
              S15677=2;
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
            if(enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 40, column: 10
              S15677=3;
              System.out.println("tableAlignedWithSensor");//sysj\plantRotaryTable.sysj line: 42, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 43, column: 5
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
            if(!alignedSensor.getprestatus() && !enable.getprestatus()){//sysj\plantRotaryTable.sysj line: 41, column: 11
              System.out.println("Not-tableAlignedWithSensor");//sysj\plantRotaryTable.sysj line: 45, column: 4
              S15677=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plantRotaryTable.sysj line: 43, column: 5
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

  public void thread19555(int [] tdone, int [] ends){
        switch(S15673){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15590){
          case 0 : 
            if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
              S15590=1;
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
              S15590=2;
              if((!rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 28, column: 20
                S15590=3;
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
              S15590=3;
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
              S15590=0;
              if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
                S15590=1;
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

  public void thread19552(int [] tdone, int [] ends){
        S16559=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 211, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 211, column: 38
      currsigs.addElement(bottleAtPos5E);
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

  public void thread19551(int [] tdone, int [] ends){
        S16551=1;
    if(bottleAtPos4.getprestatus()){//sysj\plantRotaryTable.sysj line: 209, column: 24
      bottleAtPos4E.setPresent();//sysj\plantRotaryTable.sysj line: 209, column: 38
      currsigs.addElement(bottleAtPos4E);
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

  public void thread19550(int [] tdone, int [] ends){
        S16543=1;
    if(bottleAtPos3.getprestatus()){//sysj\plantRotaryTable.sysj line: 207, column: 24
      bottleAtPos3E.setPresent();//sysj\plantRotaryTable.sysj line: 207, column: 38
      currsigs.addElement(bottleAtPos3E);
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

  public void thread19549(int [] tdone, int [] ends){
        S16535=1;
    if(bottleAtPos2.getprestatus()){//sysj\plantRotaryTable.sysj line: 205, column: 24
      bottleAtPos2E.setPresent();//sysj\plantRotaryTable.sysj line: 205, column: 38
      currsigs.addElement(bottleAtPos2E);
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

  public void thread19548(int [] tdone, int [] ends){
        S16527=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 203, column: 24
      bottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 203, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread19547(int [] tdone, int [] ends){
        S16519=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\plantRotaryTable.sysj line: 201, column: 24
      capOnBottleAtPos1E.setPresent();//sysj\plantRotaryTable.sysj line: 201, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread19546(int [] tdone, int [] ends){
        S16511=1;
    if(bottleAtPos5.getprestatus()){//sysj\plantRotaryTable.sysj line: 199, column: 24
      bottleAtPos5E.setPresent();//sysj\plantRotaryTable.sysj line: 199, column: 38
      currsigs.addElement(bottleAtPos5E);
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

  public void thread19545(int [] tdone, int [] ends){
        S16503=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\plantRotaryTable.sysj line: 197, column: 24
      tableAlignedWithSensorE.setPresent();//sysj\plantRotaryTable.sysj line: 197, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread19544(int [] tdone, int [] ends){
        S16561=1;
    thread19545(tdone,ends);
    thread19546(tdone,ends);
    thread19547(tdone,ends);
    thread19548(tdone,ends);
    thread19549(tdone,ends);
    thread19550(tdone,ends);
    thread19551(tdone,ends);
    thread19552(tdone,ends);
    int biggest19553 = 0;
    if(ends[20]>=biggest19553){
      biggest19553=ends[20];
    }
    if(ends[21]>=biggest19553){
      biggest19553=ends[21];
    }
    if(ends[22]>=biggest19553){
      biggest19553=ends[22];
    }
    if(ends[23]>=biggest19553){
      biggest19553=ends[23];
    }
    if(ends[24]>=biggest19553){
      biggest19553=ends[24];
    }
    if(ends[25]>=biggest19553){
      biggest19553=ends[25];
    }
    if(ends[26]>=biggest19553){
      biggest19553=ends[26];
    }
    if(ends[27]>=biggest19553){
      biggest19553=ends[27];
    }
    if(biggest19553 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread19543(int [] tdone, int [] ends){
        S16495=1;
    bottlecount_thread_18 = 10;//sysj\plantRotaryTable.sysj line: 181, column: 3
    if(bottleDec_1.getprestatus()){//sysj\plantRotaryTable.sysj line: 183, column: 12
      if(bottlecount_thread_18 > 0) {//sysj\plantRotaryTable.sysj line: 184, column: 5
        bottlecount_thread_18 = bottlecount_thread_18 - 1;//sysj\plantRotaryTable.sysj line: 185, column: 6
      }
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 12
        bottlecount_thread_18 = 5;//sysj\plantRotaryTable.sysj line: 188, column: 5
        if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
          currsigs.addElement(empty_1);
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
      else {
        if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
          currsigs.addElement(empty_1);
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
    }
    else {
      if(refill.getprestatus()){//sysj\plantRotaryTable.sysj line: 187, column: 12
        bottlecount_thread_18 = 5;//sysj\plantRotaryTable.sysj line: 188, column: 5
        if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
          currsigs.addElement(empty_1);
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
      else {
        if(bottlecount_thread_18 == 0){//sysj\plantRotaryTable.sysj line: 190, column: 7
          empty_1.setPresent();//sysj\plantRotaryTable.sysj line: 191, column: 4
          currsigs.addElement(empty_1);
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
    }
  }

  public void thread19541(int [] tdone, int [] ends){
        S16234=1;
    S16231=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread19540(int [] tdone, int [] ends){
        S16229=1;
    S16226=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread19539(int [] tdone, int [] ends){
        S16224=1;
    S16221=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread19538(int [] tdone, int [] ends){
        S16219=1;
    S16216=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread19537(int [] tdone, int [] ends){
        S16214=1;
    bottlePos_1.setPresent();//sysj\plantRotaryTable.sysj line: 142, column: 8
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantRotaryTable.sysj line: 142, column: 8
    bottleAt1_1.setPresent();//sysj\plantRotaryTable.sysj line: 143, column: 6
    currsigs.addElement(bottleAt1_1);
    S16214=0;
    active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread19536(int [] tdone, int [] ends){
        S16433=1;
    S16285=0;
    thread19537(tdone,ends);
    thread19538(tdone,ends);
    thread19539(tdone,ends);
    thread19540(tdone,ends);
    thread19541(tdone,ends);
    int biggest19542 = 0;
    if(ends[13]>=biggest19542){
      biggest19542=ends[13];
    }
    if(ends[14]>=biggest19542){
      biggest19542=ends[14];
    }
    if(ends[15]>=biggest19542){
      biggest19542=ends[15];
    }
    if(ends[16]>=biggest19542){
      biggest19542=ends[16];
    }
    if(ends[17]>=biggest19542){
      biggest19542=ends[17];
    }
    if(biggest19542 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread19534(int [] tdone, int [] ends){
        S15932=1;
    S15931=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\plantRotaryTable.sysj line: 118, column: 7
      System.out.println("bottleLeftPos5");//sysj\plantRotaryTable.sysj line: 120, column: 6
      bottleAtPos5.setPresent();//sysj\plantRotaryTable.sysj line: 121, column: 6
      currsigs.addElement(bottleAtPos5);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S15931=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread19533(int [] tdone, int [] ends){
        S15921=1;
    S15920=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 3){//sysj\plantRotaryTable.sysj line: 108, column: 7
      System.out.println("bottleLeftPos4");//sysj\plantRotaryTable.sysj line: 110, column: 6
      bottleAtPos4.setPresent();//sysj\plantRotaryTable.sysj line: 111, column: 6
      currsigs.addElement(bottleAtPos4);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S15920=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread19532(int [] tdone, int [] ends){
        S15910=1;
    S15909=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantRotaryTable.sysj line: 98, column: 7
      System.out.println("bottleLeftPos3");//sysj\plantRotaryTable.sysj line: 100, column: 6
      bottleAtPos3.setPresent();//sysj\plantRotaryTable.sysj line: 101, column: 6
      currsigs.addElement(bottleAtPos3);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S15909=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread19531(int [] tdone, int [] ends){
        S15899=1;
    S15898=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantRotaryTable.sysj line: 88, column: 7
      System.out.println("bottleAtPos2");//sysj\plantRotaryTable.sysj line: 90, column: 6
      bottleAtPos2.setPresent();//sysj\plantRotaryTable.sysj line: 91, column: 6
      currsigs.addElement(bottleAtPos2);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S15898=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread19530(int [] tdone, int [] ends){
        S15888=1;
    S15887=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantRotaryTable.sysj line: 78, column: 8
      System.out.println("bottleAt1");//sysj\plantRotaryTable.sysj line: 80, column: 6
      bottleAtPos1.setPresent();//sysj\plantRotaryTable.sysj line: 81, column: 6
      currsigs.addElement(bottleAtPos1);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15887=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread19529(int [] tdone, int [] ends){
        S16212=1;
    data_thread_6 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantRotaryTable.sysj line: 77, column: 3
    thread19530(tdone,ends);
    thread19531(tdone,ends);
    thread19532(tdone,ends);
    thread19533(tdone,ends);
    thread19534(tdone,ends);
    int biggest19535 = 0;
    if(ends[7]>=biggest19535){
      biggest19535=ends[7];
    }
    if(ends[8]>=biggest19535){
      biggest19535=ends[8];
    }
    if(ends[9]>=biggest19535){
      biggest19535=ends[9];
    }
    if(ends[10]>=biggest19535){
      biggest19535=ends[10];
    }
    if(ends[11]>=biggest19535){
      biggest19535=ends[11];
    }
    if(biggest19535 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread19528(int [] tdone, int [] ends){
        S15877=1;
    S15813=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread19527(int [] tdone, int [] ends){
        S15809=1;
    S15745=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19526(int [] tdone, int [] ends){
        S15741=1;
    S15677=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread19525(int [] tdone, int [] ends){
        S15673=1;
    S15590=0;
    if((rotaryTableTrigger.getprestatus() && enable.getprestatus())){//sysj\plantRotaryTable.sysj line: 23, column: 21
      S15590=1;
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
      switch(S19523){
        case 0 : 
          S19523=0;
          break RUN;
        
        case 1 : 
          S19523=2;
          S19523=2;
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
          thread19525(tdone,ends);
          thread19526(tdone,ends);
          thread19527(tdone,ends);
          thread19528(tdone,ends);
          thread19529(tdone,ends);
          thread19536(tdone,ends);
          thread19543(tdone,ends);
          thread19544(tdone,ends);
          int biggest19554 = 0;
          if(ends[2]>=biggest19554){
            biggest19554=ends[2];
          }
          if(ends[3]>=biggest19554){
            biggest19554=ends[3];
          }
          if(ends[4]>=biggest19554){
            biggest19554=ends[4];
          }
          if(ends[5]>=biggest19554){
            biggest19554=ends[5];
          }
          if(ends[6]>=biggest19554){
            biggest19554=ends[6];
          }
          if(ends[12]>=biggest19554){
            biggest19554=ends[12];
          }
          if(ends[18]>=biggest19554){
            biggest19554=ends[18];
          }
          if(ends[19]>=biggest19554){
            biggest19554=ends[19];
          }
          if(biggest19554 == 1){
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
          thread19555(tdone,ends);
          thread19556(tdone,ends);
          thread19557(tdone,ends);
          thread19558(tdone,ends);
          thread19559(tdone,ends);
          thread19572(tdone,ends);
          thread19591(tdone,ends);
          thread19592(tdone,ends);
          int biggest19602 = 0;
          if(ends[2]>=biggest19602){
            biggest19602=ends[2];
          }
          if(ends[3]>=biggest19602){
            biggest19602=ends[3];
          }
          if(ends[4]>=biggest19602){
            biggest19602=ends[4];
          }
          if(ends[5]>=biggest19602){
            biggest19602=ends[5];
          }
          if(ends[6]>=biggest19602){
            biggest19602=ends[6];
          }
          if(ends[12]>=biggest19602){
            biggest19602=ends[12];
          }
          if(ends[18]>=biggest19602){
            biggest19602=ends[18];
          }
          if(ends[19]>=biggest19602){
            biggest19602=ends[19];
          }
          if(biggest19602 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19602 == 0){
            S19523=0;
            active[1]=0;
            ends[1]=0;
            S19523=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
