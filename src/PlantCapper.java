import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantCapper extends ClockDomain{
  public PlantCapper(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal clampRetracted = new Signal("clampRetracted", Signal.OUTPUT);
  public Signal clampExtended = new Signal("clampExtended", Signal.OUTPUT);
  public Signal capGrip = new Signal("capGrip", Signal.OUTPUT);
  public Signal capNotGrip = new Signal("capNotGrip", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  public Signal clampRetractedE = new Signal("clampRetractedE", Signal.OUTPUT);
  public Signal clampExtendedE = new Signal("clampExtendedE", Signal.OUTPUT);
  public Signal capGripE = new Signal("capGripE", Signal.OUTPUT);
  public Signal capNotGripE = new Signal("capNotGripE", Signal.OUTPUT);
  private Signal bottleClamp_1;
  private Signal bottleNotClamp_1;
  private int S13139 = 1;
  private int S12549 = 1;
  private int S12498 = 1;
  private int S12671 = 1;
  private int S12569 = 1;
  private int S12557 = 1;
  private int S12589 = 1;
  private int S12577 = 1;
  private int S12730 = 1;
  private int S12679 = 1;
  private int S12738 = 1;
  private int S12812 = 1;
  private int S12746 = 1;
  private int S12740 = 1;
  private int S12754 = 1;
  private int S12762 = 1;
  private int S12770 = 1;
  private int S12778 = 1;
  private int S12786 = 1;
  private int S12794 = 1;
  private int S12802 = 1;
  private int S12810 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread13179(int [] tdone, int [] ends){
        switch(S12810){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
          capNotGripE.setPresent();//sysj\plantCapper.sysj line: 94, column: 36
          currsigs.addElement(capNotGripE);
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

  public void thread13178(int [] tdone, int [] ends){
        switch(S12802){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
          capGripE.setPresent();//sysj\plantCapper.sysj line: 92, column: 33
          currsigs.addElement(capGripE);
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

  public void thread13177(int [] tdone, int [] ends){
        switch(S12794){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
          clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 39
          currsigs.addElement(clampExtendedE);
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

  public void thread13176(int [] tdone, int [] ends){
        switch(S12786){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
          clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 40
          currsigs.addElement(clampRetractedE);
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

  public void thread13175(int [] tdone, int [] ends){
        switch(S12778){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread13174(int [] tdone, int [] ends){
        switch(S12770){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 84, column: 44
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread13173(int [] tdone, int [] ends){
        switch(S12762){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 82, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 82, column: 44
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread13172(int [] tdone, int [] ends){
        switch(S12754){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 80, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 80, column: 45
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread13171(int [] tdone, int [] ends){
        switch(S12746){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S12740){
          case 0 : 
            S12740=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12740=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12740=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S12740=1;
            S12740=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12740=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12740=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13170(int [] tdone, int [] ends){
        switch(S12812){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread13171(tdone,ends);
        thread13172(tdone,ends);
        thread13173(tdone,ends);
        thread13174(tdone,ends);
        thread13175(tdone,ends);
        thread13176(tdone,ends);
        thread13177(tdone,ends);
        thread13178(tdone,ends);
        thread13179(tdone,ends);
        int biggest13180 = 0;
        if(ends[9]>=biggest13180){
          biggest13180=ends[9];
        }
        if(ends[10]>=biggest13180){
          biggest13180=ends[10];
        }
        if(ends[11]>=biggest13180){
          biggest13180=ends[11];
        }
        if(ends[12]>=biggest13180){
          biggest13180=ends[12];
        }
        if(ends[13]>=biggest13180){
          biggest13180=ends[13];
        }
        if(ends[14]>=biggest13180){
          biggest13180=ends[14];
        }
        if(ends[15]>=biggest13180){
          biggest13180=ends[15];
        }
        if(ends[16]>=biggest13180){
          biggest13180=ends[16];
        }
        if(ends[17]>=biggest13180){
          biggest13180=ends[17];
        }
        if(biggest13180 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest13180 == 0){
          S12812=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread13169(int [] tdone, int [] ends){
        switch(S12738){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 73, column: 4
        currsigs.addElement(bottleAtPos4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread13168(int [] tdone, int [] ends){
        switch(S12730){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S12679){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
              S12679=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
              currsigs.addElement(clampRetracted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 63, column: 10
              S12679=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 64, column: 20
                S12679=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampExtended.setPresent();//sysj\plantCapper.sysj line: 65, column: 5
                currsigs.addElement(clampExtended);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 64, column: 20
              S12679=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampExtended.setPresent();//sysj\plantCapper.sysj line: 65, column: 5
              currsigs.addElement(clampExtended);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 67, column: 10
              S12679=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
                S12679=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
                currsigs.addElement(clampRetracted);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
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

  public void thread13166(int [] tdone, int [] ends){
        S12589=1;
    S12577=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
      S12577=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13165(int [] tdone, int [] ends){
        S12569=1;
    S12557=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
      S12557=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13163(int [] tdone, int [] ends){
        switch(S12589){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S12577){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
              S12577=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
              currsigs.addElement(capNotGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 49, column: 11
              S12577=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 21
                S12577=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                capGrip.setPresent();//sysj\plantCapper.sysj line: 51, column: 6
                currsigs.addElement(capGrip);
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
          
          case 2 : 
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 21
              S12577=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip.setPresent();//sysj\plantCapper.sysj line: 51, column: 6
              currsigs.addElement(capGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 53, column: 11
              S12589=0;
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
        break;
      
    }
  }

  public void thread13162(int [] tdone, int [] ends){
        switch(S12569){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S12557){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
              S12557=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 38, column: 11
              S12557=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 39, column: 21
                S12557=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 40, column: 6
                currsigs.addElement(gripperTurnFinalPos);
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
          
          case 2 : 
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 39, column: 21
              S12557=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 40, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 42, column: 11
              S12569=0;
              active[4]=0;
              ends[4]=0;
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

  public void thread13161(int [] tdone, int [] ends){
        switch(S12671){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread13162(tdone,ends);
        thread13163(tdone,ends);
        int biggest13164 = 0;
        if(ends[4]>=biggest13164){
          biggest13164=ends[4];
        }
        if(ends[5]>=biggest13164){
          biggest13164=ends[5];
        }
        if(biggest13164 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest13164 == 0){
          thread13165(tdone,ends);
          thread13166(tdone,ends);
          int biggest13167 = 0;
          if(ends[4]>=biggest13167){
            biggest13167=ends[4];
          }
          if(ends[5]>=biggest13167){
            biggest13167=ends[5];
          }
          if(biggest13167 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread13160(int [] tdone, int [] ends){
        switch(S12549){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12498){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
              S12498=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 24, column: 10
              S12498=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 25, column: 20
                S12498=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 26, column: 5
                currsigs.addElement(gripperZAxisLowered);
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
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 25, column: 20
              S12498=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 26, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 28, column: 10
              S12498=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
                S12498=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
                currsigs.addElement(gripperZAxisLifted);
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

  public void thread13157(int [] tdone, int [] ends){
        S12810=1;
    if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
      capNotGripE.setPresent();//sysj\plantCapper.sysj line: 94, column: 36
      currsigs.addElement(capNotGripE);
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

  public void thread13156(int [] tdone, int [] ends){
        S12802=1;
    if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
      capGripE.setPresent();//sysj\plantCapper.sysj line: 92, column: 33
      currsigs.addElement(capGripE);
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

  public void thread13155(int [] tdone, int [] ends){
        S12794=1;
    if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
      clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 39
      currsigs.addElement(clampExtendedE);
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

  public void thread13154(int [] tdone, int [] ends){
        S12786=1;
    if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
      clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 40
      currsigs.addElement(clampRetractedE);
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

  public void thread13153(int [] tdone, int [] ends){
        S12778=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread13152(int [] tdone, int [] ends){
        S12770=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 84, column: 44
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread13151(int [] tdone, int [] ends){
        S12762=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 82, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 82, column: 44
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread13150(int [] tdone, int [] ends){
        S12754=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 80, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 80, column: 45
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread13149(int [] tdone, int [] ends){
        S12746=1;
    S12740=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
      currsigs.addElement(bottleAtPos4E);
      S12740=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S12740=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread13148(int [] tdone, int [] ends){
        S12812=1;
    thread13149(tdone,ends);
    thread13150(tdone,ends);
    thread13151(tdone,ends);
    thread13152(tdone,ends);
    thread13153(tdone,ends);
    thread13154(tdone,ends);
    thread13155(tdone,ends);
    thread13156(tdone,ends);
    thread13157(tdone,ends);
    int biggest13158 = 0;
    if(ends[9]>=biggest13158){
      biggest13158=ends[9];
    }
    if(ends[10]>=biggest13158){
      biggest13158=ends[10];
    }
    if(ends[11]>=biggest13158){
      biggest13158=ends[11];
    }
    if(ends[12]>=biggest13158){
      biggest13158=ends[12];
    }
    if(ends[13]>=biggest13158){
      biggest13158=ends[13];
    }
    if(ends[14]>=biggest13158){
      biggest13158=ends[14];
    }
    if(ends[15]>=biggest13158){
      biggest13158=ends[15];
    }
    if(ends[16]>=biggest13158){
      biggest13158=ends[16];
    }
    if(ends[17]>=biggest13158){
      biggest13158=ends[17];
    }
    if(biggest13158 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread13147(int [] tdone, int [] ends){
        S12738=1;
    bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 73, column: 4
    currsigs.addElement(bottleAtPos4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread13146(int [] tdone, int [] ends){
        S12730=1;
    S12679=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
      S12679=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
      currsigs.addElement(clampRetracted);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread13144(int [] tdone, int [] ends){
        S12589=1;
    S12577=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
      S12577=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13143(int [] tdone, int [] ends){
        S12569=1;
    S12557=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
      S12557=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13142(int [] tdone, int [] ends){
        S12671=1;
    thread13143(tdone,ends);
    thread13144(tdone,ends);
    int biggest13145 = 0;
    if(ends[4]>=biggest13145){
      biggest13145=ends[4];
    }
    if(ends[5]>=biggest13145){
      biggest13145=ends[5];
    }
    if(biggest13145 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread13141(int [] tdone, int [] ends){
        S12549=1;
    S12498=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
      S12498=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
      currsigs.addElement(gripperZAxisLifted);
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
      switch(S13139){
        case 0 : 
          S13139=0;
          break RUN;
        
        case 1 : 
          S13139=2;
          S13139=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapper.sysj line: 8, column: 1
            public void run() {//sysj\plantCapper.sysj line: 11, column: 21
              org.compsys704.Capper.main(null);//sysj\plantCapper.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantCapper.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapper.sysj line: 15, column: 2
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread13141(tdone,ends);
          thread13142(tdone,ends);
          thread13146(tdone,ends);
          thread13147(tdone,ends);
          thread13148(tdone,ends);
          int biggest13159 = 0;
          if(ends[2]>=biggest13159){
            biggest13159=ends[2];
          }
          if(ends[3]>=biggest13159){
            biggest13159=ends[3];
          }
          if(ends[6]>=biggest13159){
            biggest13159=ends[6];
          }
          if(ends[7]>=biggest13159){
            biggest13159=ends[7];
          }
          if(ends[8]>=biggest13159){
            biggest13159=ends[8];
          }
          if(biggest13159 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread13160(tdone,ends);
          thread13161(tdone,ends);
          thread13168(tdone,ends);
          thread13169(tdone,ends);
          thread13170(tdone,ends);
          int biggest13181 = 0;
          if(ends[2]>=biggest13181){
            biggest13181=ends[2];
          }
          if(ends[3]>=biggest13181){
            biggest13181=ends[3];
          }
          if(ends[6]>=biggest13181){
            biggest13181=ends[6];
          }
          if(ends[7]>=biggest13181){
            biggest13181=ends[7];
          }
          if(ends[8]>=biggest13181){
            biggest13181=ends[8];
          }
          if(biggest13181 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest13181 == 0){
            S13139=0;
            active[1]=0;
            ends[1]=0;
            S13139=0;
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
    bottleClamp_1 = new Signal();
    bottleNotClamp_1 = new Signal();
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
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      enable.setpreclear();
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      clampRetracted.setpreclear();
      clampExtended.setpreclear();
      capGrip.setpreclear();
      capNotGrip.setpreclear();
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      clampRetractedE.setpreclear();
      clampExtendedE.setpreclear();
      capGripE.setpreclear();
      capNotGripE.setpreclear();
      bottleClamp_1.setpreclear();
      bottleNotClamp_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      clampRetracted.sethook();
      clampRetracted.setClear();
      clampExtended.sethook();
      clampExtended.setClear();
      capGrip.sethook();
      capGrip.setClear();
      capNotGrip.sethook();
      capNotGrip.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      clampRetractedE.sethook();
      clampRetractedE.setClear();
      clampExtendedE.sethook();
      clampExtendedE.setClear();
      capGripE.sethook();
      capGripE.setClear();
      capNotGripE.sethook();
      capNotGripE.setClear();
      bottleClamp_1.setClear();
      bottleNotClamp_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
