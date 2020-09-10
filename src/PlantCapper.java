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
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  private Signal bottleClamp_1;
  private Signal bottleNotClamp_1;
  private Signal capGrip_1;
  private Signal capNotGrip_1;
  private int S8765 = 1;
  private int S8424 = 1;
  private int S8341 = 1;
  private int S8618 = 1;
  private int S8456 = 1;
  private int S8436 = 1;
  private int S8488 = 1;
  private int S8468 = 1;
  private int S8713 = 1;
  private int S8630 = 1;
  private int S8721 = 1;
  private int S8763 = 1;
  private int S8729 = 1;
  private int S8723 = 1;
  private int S8737 = 1;
  private int S8745 = 1;
  private int S8753 = 1;
  private int S8761 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread8797(int [] tdone, int [] ends){
        switch(S8761){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 85, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 85, column: 45
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

  public void thread8796(int [] tdone, int [] ends){
        switch(S8753){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 83, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 83, column: 44
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

  public void thread8795(int [] tdone, int [] ends){
        switch(S8745){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 81, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 81, column: 44
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

  public void thread8794(int [] tdone, int [] ends){
        switch(S8737){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 79, column: 45
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

  public void thread8793(int [] tdone, int [] ends){
        switch(S8729){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S8723){
          case 0 : 
            S8723=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
              currsigs.addElement(bottleAtPos4E);
              S8723=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S8723=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S8723=1;
            S8723=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
              currsigs.addElement(bottleAtPos4E);
              S8723=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S8723=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8792(int [] tdone, int [] ends){
        switch(S8763){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread8793(tdone,ends);
        thread8794(tdone,ends);
        thread8795(tdone,ends);
        thread8796(tdone,ends);
        thread8797(tdone,ends);
        int biggest8798 = 0;
        if(ends[9]>=biggest8798){
          biggest8798=ends[9];
        }
        if(ends[10]>=biggest8798){
          biggest8798=ends[10];
        }
        if(ends[11]>=biggest8798){
          biggest8798=ends[11];
        }
        if(ends[12]>=biggest8798){
          biggest8798=ends[12];
        }
        if(ends[13]>=biggest8798){
          biggest8798=ends[13];
        }
        if(biggest8798 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest8798 == 0){
          S8763=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread8791(int [] tdone, int [] ends){
        switch(S8721){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 72, column: 4
        currsigs.addElement(bottleAtPos4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread8790(int [] tdone, int [] ends){
        switch(S8713){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S8630){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
              S8630=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
              currsigs.addElement(bottleNotClamp_1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 61, column: 10
              S8630=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 62, column: 20
                S8630=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleClamp");//sysj\plantCapper.sysj line: 63, column: 5
                bottleClamp_1.setPresent();//sysj\plantCapper.sysj line: 64, column: 5
                currsigs.addElement(bottleClamp_1);
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
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 62, column: 20
              S8630=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleClamp_1.setPresent();//sysj\plantCapper.sysj line: 64, column: 5
              currsigs.addElement(bottleClamp_1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 66, column: 10
              S8630=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
                S8630=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 58, column: 5
                bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
                currsigs.addElement(bottleNotClamp_1);
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

  public void thread8788(int [] tdone, int [] ends){
        S8488=1;
    S8468=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
      S8468=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 42, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread8787(int [] tdone, int [] ends){
        S8456=1;
    S8436=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
      S8436=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 29, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread8785(int [] tdone, int [] ends){
        switch(S8488){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S8468){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
              S8468=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
              currsigs.addElement(capNotGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 45, column: 11
              S8468=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 21
                S8468=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("capGrip");//sysj\plantCapper.sysj line: 47, column: 6
                capGrip_1.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
                currsigs.addElement(capGrip_1);
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
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 21
              S8468=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip_1.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
              currsigs.addElement(capGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 50, column: 11
              S8488=0;
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

  public void thread8784(int [] tdone, int [] ends){
        switch(S8456){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S8436){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
              S8436=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 32, column: 11
              S8436=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 33, column: 21
                S8436=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("gripperTurnFinalPos");//sysj\plantCapper.sysj line: 34, column: 6
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 35, column: 6
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
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 33, column: 21
              S8436=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 35, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 37, column: 11
              S8456=0;
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

  public void thread8783(int [] tdone, int [] ends){
        switch(S8618){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread8784(tdone,ends);
        thread8785(tdone,ends);
        int biggest8786 = 0;
        if(ends[4]>=biggest8786){
          biggest8786=ends[4];
        }
        if(ends[5]>=biggest8786){
          biggest8786=ends[5];
        }
        if(biggest8786 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest8786 == 0){
          thread8787(tdone,ends);
          thread8788(tdone,ends);
          int biggest8789 = 0;
          if(ends[4]>=biggest8789){
            biggest8789=ends[4];
          }
          if(ends[5]>=biggest8789){
            biggest8789=ends[5];
          }
          if(biggest8789 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread8782(int [] tdone, int [] ends){
        switch(S8424){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S8341){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
              S8341=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 16, column: 10
              S8341=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 17, column: 20
                S8341=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLowered");//sysj\plantCapper.sysj line: 18, column: 5
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 19, column: 5
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
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 17, column: 20
              S8341=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 19, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 21, column: 10
              S8341=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
                S8341=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 13, column: 5
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
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

  public void thread8779(int [] tdone, int [] ends){
        S8761=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 85, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 85, column: 45
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

  public void thread8778(int [] tdone, int [] ends){
        S8753=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 83, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 83, column: 44
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

  public void thread8777(int [] tdone, int [] ends){
        S8745=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 81, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 81, column: 44
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

  public void thread8776(int [] tdone, int [] ends){
        S8737=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 79, column: 45
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

  public void thread8775(int [] tdone, int [] ends){
        S8729=1;
    S8723=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
      currsigs.addElement(bottleAtPos4E);
      S8723=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S8723=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread8774(int [] tdone, int [] ends){
        S8763=1;
    thread8775(tdone,ends);
    thread8776(tdone,ends);
    thread8777(tdone,ends);
    thread8778(tdone,ends);
    thread8779(tdone,ends);
    int biggest8780 = 0;
    if(ends[9]>=biggest8780){
      biggest8780=ends[9];
    }
    if(ends[10]>=biggest8780){
      biggest8780=ends[10];
    }
    if(ends[11]>=biggest8780){
      biggest8780=ends[11];
    }
    if(ends[12]>=biggest8780){
      biggest8780=ends[12];
    }
    if(ends[13]>=biggest8780){
      biggest8780=ends[13];
    }
    if(biggest8780 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread8773(int [] tdone, int [] ends){
        S8721=1;
    bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 72, column: 4
    currsigs.addElement(bottleAtPos4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread8772(int [] tdone, int [] ends){
        S8713=1;
    S8630=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
      S8630=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 58, column: 5
      bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
      currsigs.addElement(bottleNotClamp_1);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread8770(int [] tdone, int [] ends){
        S8488=1;
    S8468=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
      S8468=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 42, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread8769(int [] tdone, int [] ends){
        S8456=1;
    S8436=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
      S8436=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 29, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread8768(int [] tdone, int [] ends){
        S8618=1;
    thread8769(tdone,ends);
    thread8770(tdone,ends);
    int biggest8771 = 0;
    if(ends[4]>=biggest8771){
      biggest8771=ends[4];
    }
    if(ends[5]>=biggest8771){
      biggest8771=ends[5];
    }
    if(biggest8771 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread8767(int [] tdone, int [] ends){
        S8424=1;
    S8341=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
      S8341=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 13, column: 5
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
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
      switch(S8765){
        case 0 : 
          S8765=0;
          break RUN;
        
        case 1 : 
          S8765=2;
          S8765=2;
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          thread8767(tdone,ends);
          thread8768(tdone,ends);
          thread8772(tdone,ends);
          thread8773(tdone,ends);
          thread8774(tdone,ends);
          int biggest8781 = 0;
          if(ends[2]>=biggest8781){
            biggest8781=ends[2];
          }
          if(ends[3]>=biggest8781){
            biggest8781=ends[3];
          }
          if(ends[6]>=biggest8781){
            biggest8781=ends[6];
          }
          if(ends[7]>=biggest8781){
            biggest8781=ends[7];
          }
          if(ends[8]>=biggest8781){
            biggest8781=ends[8];
          }
          if(biggest8781 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          thread8782(tdone,ends);
          thread8783(tdone,ends);
          thread8790(tdone,ends);
          thread8791(tdone,ends);
          thread8792(tdone,ends);
          int biggest8799 = 0;
          if(ends[2]>=biggest8799){
            biggest8799=ends[2];
          }
          if(ends[3]>=biggest8799){
            biggest8799=ends[3];
          }
          if(ends[6]>=biggest8799){
            biggest8799=ends[6];
          }
          if(ends[7]>=biggest8799){
            biggest8799=ends[7];
          }
          if(ends[8]>=biggest8799){
            biggest8799=ends[8];
          }
          if(biggest8799 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest8799 == 0){
            S8765=0;
            active[1]=0;
            ends[1]=0;
            S8765=0;
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
    bottleClamp_1 = new Signal();
    bottleNotClamp_1 = new Signal();
    capGrip_1 = new Signal();
    capNotGrip_1 = new Signal();
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
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      bottleClamp_1.setpreclear();
      bottleNotClamp_1.setpreclear();
      capGrip_1.setpreclear();
      capNotGrip_1.setpreclear();
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
      bottleClamp_1.setClear();
      bottleNotClamp_1.setClear();
      capGrip_1.setClear();
      capNotGrip_1.setClear();
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
