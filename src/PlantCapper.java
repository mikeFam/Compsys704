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
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  public Signal clampRetractedE = new Signal("clampRetractedE", Signal.OUTPUT);
  public Signal clampExtendedE = new Signal("clampExtendedE", Signal.OUTPUT);
  private Signal bottleClamp_1;
  private Signal bottleNotClamp_1;
  private Signal capGrip_1;
  private Signal capNotGrip_1;
  private int S11434 = 1;
  private int S10622 = 1;
  private int S10539 = 1;
  private int S10816 = 1;
  private int S10654 = 1;
  private int S10634 = 1;
  private int S10686 = 1;
  private int S10666 = 1;
  private int S10911 = 1;
  private int S10828 = 1;
  private int S10919 = 1;
  private int S10977 = 1;
  private int S10927 = 1;
  private int S10921 = 1;
  private int S10935 = 1;
  private int S10943 = 1;
  private int S10951 = 1;
  private int S10959 = 1;
  private int S10967 = 1;
  private int S10975 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread11470(int [] tdone, int [] ends){
        switch(S10975){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
          clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 98, column: 39
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

  public void thread11469(int [] tdone, int [] ends){
        switch(S10967){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
          clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 40
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

  public void thread11468(int [] tdone, int [] ends){
        switch(S10959){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 94, column: 45
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

  public void thread11467(int [] tdone, int [] ends){
        switch(S10951){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 44
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

  public void thread11466(int [] tdone, int [] ends){
        switch(S10943){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
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

  public void thread11465(int [] tdone, int [] ends){
        switch(S10935){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 88, column: 45
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

  public void thread11464(int [] tdone, int [] ends){
        switch(S10927){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S10921){
          case 0 : 
            S10921=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 86, column: 38
              currsigs.addElement(bottleAtPos4E);
              S10921=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S10921=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S10921=1;
            S10921=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 86, column: 38
              currsigs.addElement(bottleAtPos4E);
              S10921=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S10921=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11463(int [] tdone, int [] ends){
        switch(S10977){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread11464(tdone,ends);
        thread11465(tdone,ends);
        thread11466(tdone,ends);
        thread11467(tdone,ends);
        thread11468(tdone,ends);
        thread11469(tdone,ends);
        thread11470(tdone,ends);
        int biggest11471 = 0;
        if(ends[9]>=biggest11471){
          biggest11471=ends[9];
        }
        if(ends[10]>=biggest11471){
          biggest11471=ends[10];
        }
        if(ends[11]>=biggest11471){
          biggest11471=ends[11];
        }
        if(ends[12]>=biggest11471){
          biggest11471=ends[12];
        }
        if(ends[13]>=biggest11471){
          biggest11471=ends[13];
        }
        if(ends[14]>=biggest11471){
          biggest11471=ends[14];
        }
        if(ends[15]>=biggest11471){
          biggest11471=ends[15];
        }
        if(biggest11471 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest11471 == 0){
          S10977=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread11462(int [] tdone, int [] ends){
        switch(S10919){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 81, column: 4
        currsigs.addElement(bottleAtPos4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread11461(int [] tdone, int [] ends){
        switch(S10911){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S10828){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 66, column: 21
              S10828=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampRetracted.setPresent();//sysj\plantCapper.sysj line: 68, column: 5
              currsigs.addElement(clampRetracted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 70, column: 10
              S10828=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 71, column: 20
                S10828=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleClamp");//sysj\plantCapper.sysj line: 72, column: 5
                clampExtended.setPresent();//sysj\plantCapper.sysj line: 73, column: 5
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
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 71, column: 20
              S10828=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampExtended.setPresent();//sysj\plantCapper.sysj line: 73, column: 5
              currsigs.addElement(clampExtended);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 75, column: 10
              S10828=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 66, column: 21
                S10828=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 67, column: 5
                clampRetracted.setPresent();//sysj\plantCapper.sysj line: 68, column: 5
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

  public void thread11459(int [] tdone, int [] ends){
        S10686=1;
    S10666=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 22
      S10666=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 51, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread11458(int [] tdone, int [] ends){
        S10654=1;
    S10634=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 37, column: 22
      S10634=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 38, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 39, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread11456(int [] tdone, int [] ends){
        switch(S10686){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10666){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 22
              S10666=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
              currsigs.addElement(capNotGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 54, column: 11
              S10666=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 55, column: 21
                S10666=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("capGrip");//sysj\plantCapper.sysj line: 56, column: 6
                capGrip_1.setPresent();//sysj\plantCapper.sysj line: 57, column: 6
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
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 55, column: 21
              S10666=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip_1.setPresent();//sysj\plantCapper.sysj line: 57, column: 6
              currsigs.addElement(capGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 59, column: 11
              S10686=0;
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

  public void thread11455(int [] tdone, int [] ends){
        switch(S10654){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S10634){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 37, column: 22
              S10634=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 39, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 41, column: 11
              S10634=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 42, column: 21
                S10634=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("gripperTurnFinalPos");//sysj\plantCapper.sysj line: 43, column: 6
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 44, column: 6
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
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 42, column: 21
              S10634=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 44, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 46, column: 11
              S10654=0;
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

  public void thread11454(int [] tdone, int [] ends){
        switch(S10816){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread11455(tdone,ends);
        thread11456(tdone,ends);
        int biggest11457 = 0;
        if(ends[4]>=biggest11457){
          biggest11457=ends[4];
        }
        if(ends[5]>=biggest11457){
          biggest11457=ends[5];
        }
        if(biggest11457 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest11457 == 0){
          thread11458(tdone,ends);
          thread11459(tdone,ends);
          int biggest11460 = 0;
          if(ends[4]>=biggest11460){
            biggest11460=ends[4];
          }
          if(ends[5]>=biggest11460){
            biggest11460=ends[5];
          }
          if(biggest11460 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread11453(int [] tdone, int [] ends){
        switch(S10622){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10539){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
              S10539=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 25, column: 10
              S10539=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
                S10539=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLowered");//sysj\plantCapper.sysj line: 27, column: 5
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 28, column: 5
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
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
              S10539=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 28, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 30, column: 10
              S10539=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
                S10539=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 22, column: 5
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
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

  public void thread11450(int [] tdone, int [] ends){
        S10975=1;
    if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
      clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 98, column: 39
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

  public void thread11449(int [] tdone, int [] ends){
        S10967=1;
    if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
      clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 40
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

  public void thread11448(int [] tdone, int [] ends){
        S10959=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 94, column: 45
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

  public void thread11447(int [] tdone, int [] ends){
        S10951=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 44
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

  public void thread11446(int [] tdone, int [] ends){
        S10943=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
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

  public void thread11445(int [] tdone, int [] ends){
        S10935=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 88, column: 45
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

  public void thread11444(int [] tdone, int [] ends){
        S10927=1;
    S10921=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 86, column: 38
      currsigs.addElement(bottleAtPos4E);
      S10921=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S10921=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread11443(int [] tdone, int [] ends){
        S10977=1;
    thread11444(tdone,ends);
    thread11445(tdone,ends);
    thread11446(tdone,ends);
    thread11447(tdone,ends);
    thread11448(tdone,ends);
    thread11449(tdone,ends);
    thread11450(tdone,ends);
    int biggest11451 = 0;
    if(ends[9]>=biggest11451){
      biggest11451=ends[9];
    }
    if(ends[10]>=biggest11451){
      biggest11451=ends[10];
    }
    if(ends[11]>=biggest11451){
      biggest11451=ends[11];
    }
    if(ends[12]>=biggest11451){
      biggest11451=ends[12];
    }
    if(ends[13]>=biggest11451){
      biggest11451=ends[13];
    }
    if(ends[14]>=biggest11451){
      biggest11451=ends[14];
    }
    if(ends[15]>=biggest11451){
      biggest11451=ends[15];
    }
    if(biggest11451 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread11442(int [] tdone, int [] ends){
        S10919=1;
    bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 81, column: 4
    currsigs.addElement(bottleAtPos4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread11441(int [] tdone, int [] ends){
        S10911=1;
    S10828=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 66, column: 21
      S10828=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 67, column: 5
      clampRetracted.setPresent();//sysj\plantCapper.sysj line: 68, column: 5
      currsigs.addElement(clampRetracted);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread11439(int [] tdone, int [] ends){
        S10686=1;
    S10666=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 22
      S10666=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 51, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread11438(int [] tdone, int [] ends){
        S10654=1;
    S10634=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 37, column: 22
      S10634=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 38, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 39, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread11437(int [] tdone, int [] ends){
        S10816=1;
    thread11438(tdone,ends);
    thread11439(tdone,ends);
    int biggest11440 = 0;
    if(ends[4]>=biggest11440){
      biggest11440=ends[4];
    }
    if(ends[5]>=biggest11440){
      biggest11440=ends[5];
    }
    if(biggest11440 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread11436(int [] tdone, int [] ends){
        S10622=1;
    S10539=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
      S10539=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 22, column: 5
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
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
      switch(S11434){
        case 0 : 
          S11434=0;
          break RUN;
        
        case 1 : 
          S11434=2;
          S11434=2;
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
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread11436(tdone,ends);
          thread11437(tdone,ends);
          thread11441(tdone,ends);
          thread11442(tdone,ends);
          thread11443(tdone,ends);
          int biggest11452 = 0;
          if(ends[2]>=biggest11452){
            biggest11452=ends[2];
          }
          if(ends[3]>=biggest11452){
            biggest11452=ends[3];
          }
          if(ends[6]>=biggest11452){
            biggest11452=ends[6];
          }
          if(ends[7]>=biggest11452){
            biggest11452=ends[7];
          }
          if(ends[8]>=biggest11452){
            biggest11452=ends[8];
          }
          if(biggest11452 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread11453(tdone,ends);
          thread11454(tdone,ends);
          thread11461(tdone,ends);
          thread11462(tdone,ends);
          thread11463(tdone,ends);
          int biggest11472 = 0;
          if(ends[2]>=biggest11472){
            biggest11472=ends[2];
          }
          if(ends[3]>=biggest11472){
            biggest11472=ends[3];
          }
          if(ends[6]>=biggest11472){
            biggest11472=ends[6];
          }
          if(ends[7]>=biggest11472){
            biggest11472=ends[7];
          }
          if(ends[8]>=biggest11472){
            biggest11472=ends[8];
          }
          if(biggest11472 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest11472 == 0){
            S11434=0;
            active[1]=0;
            ends[1]=0;
            S11434=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      clampRetracted.setpreclear();
      clampExtended.setpreclear();
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      clampRetractedE.setpreclear();
      clampExtendedE.setpreclear();
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
      clampRetracted.sethook();
      clampRetracted.setClear();
      clampExtended.sethook();
      clampExtended.setClear();
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
