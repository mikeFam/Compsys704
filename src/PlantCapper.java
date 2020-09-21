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
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enableCapper = new Signal("enableCapper", Signal.INPUT);
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
  private int S12794 = 1;
  private int S12090 = 1;
  private int S12039 = 1;
  private int S12212 = 1;
  private int S12110 = 1;
  private int S12098 = 1;
  private int S12130 = 1;
  private int S12118 = 1;
  private int S12271 = 1;
  private int S12220 = 1;
  private int S12336 = 1;
  private int S12289 = 1;
  private int S12410 = 1;
  private int S12344 = 1;
  private int S12338 = 1;
  private int S12352 = 1;
  private int S12360 = 1;
  private int S12368 = 1;
  private int S12376 = 1;
  private int S12384 = 1;
  private int S12392 = 1;
  private int S12400 = 1;
  private int S12408 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread12834(int [] tdone, int [] ends){
        switch(S12408){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 100, column: 24
          capNotGripE.setPresent();//sysj\plantCapper.sysj line: 100, column: 36
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

  public void thread12833(int [] tdone, int [] ends){
        switch(S12400){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
          capGripE.setPresent();//sysj\plantCapper.sysj line: 98, column: 33
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

  public void thread12832(int [] tdone, int [] ends){
        switch(S12392){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
          clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 39
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

  public void thread12831(int [] tdone, int [] ends){
        switch(S12384){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
          clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 94, column: 40
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

  public void thread12830(int [] tdone, int [] ends){
        switch(S12376){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 45
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

  public void thread12829(int [] tdone, int [] ends){
        switch(S12368){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
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

  public void thread12828(int [] tdone, int [] ends){
        switch(S12360){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 44
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

  public void thread12827(int [] tdone, int [] ends){
        switch(S12352){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
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

  public void thread12826(int [] tdone, int [] ends){
        switch(S12344){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S12338){
          case 0 : 
            S12338=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12338=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12338=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S12338=1;
            S12338=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12338=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12338=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12825(int [] tdone, int [] ends){
        switch(S12410){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread12826(tdone,ends);
        thread12827(tdone,ends);
        thread12828(tdone,ends);
        thread12829(tdone,ends);
        thread12830(tdone,ends);
        thread12831(tdone,ends);
        thread12832(tdone,ends);
        thread12833(tdone,ends);
        thread12834(tdone,ends);
        int biggest12835 = 0;
        if(ends[9]>=biggest12835){
          biggest12835=ends[9];
        }
        if(ends[10]>=biggest12835){
          biggest12835=ends[10];
        }
        if(ends[11]>=biggest12835){
          biggest12835=ends[11];
        }
        if(ends[12]>=biggest12835){
          biggest12835=ends[12];
        }
        if(ends[13]>=biggest12835){
          biggest12835=ends[13];
        }
        if(ends[14]>=biggest12835){
          biggest12835=ends[14];
        }
        if(ends[15]>=biggest12835){
          biggest12835=ends[15];
        }
        if(ends[16]>=biggest12835){
          biggest12835=ends[16];
        }
        if(ends[17]>=biggest12835){
          biggest12835=ends[17];
        }
        if(biggest12835 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest12835 == 0){
          S12410=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread12824(int [] tdone, int [] ends){
        switch(S12336){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S12289){
          case 0 : 
            if(enableCapper.getprestatus()){//sysj\plantCapper.sysj line: 74, column: 11
              S12289=1;
              if((!enableCapper.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 75, column: 21
                S12289=2;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                System.out.println("enableCapper");//sysj\plantCapper.sysj line: 76, column: 5
                bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 77, column: 5
                currsigs.addElement(bottleAtPos4);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if((!enableCapper.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 75, column: 21
              S12289=2;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 77, column: 5
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 9
              S12289=0;
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

  public void thread12823(int [] tdone, int [] ends){
        switch(S12271){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S12220){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
              S12220=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
              currsigs.addElement(clampRetracted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 64, column: 10
              S12220=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 65, column: 20
                S12220=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampExtended.setPresent();//sysj\plantCapper.sysj line: 66, column: 5
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
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 65, column: 20
              S12220=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampExtended.setPresent();//sysj\plantCapper.sysj line: 66, column: 5
              currsigs.addElement(clampExtended);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 68, column: 10
              S12220=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
                S12220=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
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

  public void thread12821(int [] tdone, int [] ends){
        S12130=1;
    S12118=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S12118=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread12820(int [] tdone, int [] ends){
        S12110=1;
    S12098=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S12098=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread12818(int [] tdone, int [] ends){
        switch(S12130){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S12118){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
              S12118=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
              currsigs.addElement(capNotGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 50, column: 11
              S12118=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 51, column: 21
                S12118=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                capGrip.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
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
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 51, column: 21
              S12118=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
              currsigs.addElement(capGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 54, column: 11
              S12130=0;
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

  public void thread12817(int [] tdone, int [] ends){
        switch(S12110){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S12098){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
              S12098=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 39, column: 11
              S12098=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 40, column: 21
                S12098=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 41, column: 6
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
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 40, column: 21
              S12098=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 41, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 43, column: 11
              S12110=0;
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

  public void thread12816(int [] tdone, int [] ends){
        switch(S12212){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread12817(tdone,ends);
        thread12818(tdone,ends);
        int biggest12819 = 0;
        if(ends[4]>=biggest12819){
          biggest12819=ends[4];
        }
        if(ends[5]>=biggest12819){
          biggest12819=ends[5];
        }
        if(biggest12819 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest12819 == 0){
          thread12820(tdone,ends);
          thread12821(tdone,ends);
          int biggest12822 = 0;
          if(ends[4]>=biggest12822){
            biggest12822=ends[4];
          }
          if(ends[5]>=biggest12822){
            biggest12822=ends[5];
          }
          if(biggest12822 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread12815(int [] tdone, int [] ends){
        switch(S12090){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12039){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
              S12039=1;
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
              S12039=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
                S12039=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 27, column: 5
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
              S12039=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 27, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 29, column: 10
              S12039=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
                S12039=1;
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

  public void thread12812(int [] tdone, int [] ends){
        S12408=1;
    if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 100, column: 24
      capNotGripE.setPresent();//sysj\plantCapper.sysj line: 100, column: 36
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

  public void thread12811(int [] tdone, int [] ends){
        S12400=1;
    if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
      capGripE.setPresent();//sysj\plantCapper.sysj line: 98, column: 33
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

  public void thread12810(int [] tdone, int [] ends){
        S12392=1;
    if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
      clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 39
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

  public void thread12809(int [] tdone, int [] ends){
        S12384=1;
    if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
      clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 94, column: 40
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

  public void thread12808(int [] tdone, int [] ends){
        S12376=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 45
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

  public void thread12807(int [] tdone, int [] ends){
        S12368=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
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

  public void thread12806(int [] tdone, int [] ends){
        S12360=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 44
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

  public void thread12805(int [] tdone, int [] ends){
        S12352=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
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

  public void thread12804(int [] tdone, int [] ends){
        S12344=1;
    S12338=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
      currsigs.addElement(bottleAtPos4E);
      S12338=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S12338=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread12803(int [] tdone, int [] ends){
        S12410=1;
    thread12804(tdone,ends);
    thread12805(tdone,ends);
    thread12806(tdone,ends);
    thread12807(tdone,ends);
    thread12808(tdone,ends);
    thread12809(tdone,ends);
    thread12810(tdone,ends);
    thread12811(tdone,ends);
    thread12812(tdone,ends);
    int biggest12813 = 0;
    if(ends[9]>=biggest12813){
      biggest12813=ends[9];
    }
    if(ends[10]>=biggest12813){
      biggest12813=ends[10];
    }
    if(ends[11]>=biggest12813){
      biggest12813=ends[11];
    }
    if(ends[12]>=biggest12813){
      biggest12813=ends[12];
    }
    if(ends[13]>=biggest12813){
      biggest12813=ends[13];
    }
    if(ends[14]>=biggest12813){
      biggest12813=ends[14];
    }
    if(ends[15]>=biggest12813){
      biggest12813=ends[15];
    }
    if(ends[16]>=biggest12813){
      biggest12813=ends[16];
    }
    if(ends[17]>=biggest12813){
      biggest12813=ends[17];
    }
    if(biggest12813 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread12802(int [] tdone, int [] ends){
        S12336=1;
    S12289=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread12801(int [] tdone, int [] ends){
        S12271=1;
    S12220=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
      S12220=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
      currsigs.addElement(clampRetracted);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread12799(int [] tdone, int [] ends){
        S12130=1;
    S12118=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S12118=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread12798(int [] tdone, int [] ends){
        S12110=1;
    S12098=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S12098=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread12797(int [] tdone, int [] ends){
        S12212=1;
    thread12798(tdone,ends);
    thread12799(tdone,ends);
    int biggest12800 = 0;
    if(ends[4]>=biggest12800){
      biggest12800=ends[4];
    }
    if(ends[5]>=biggest12800){
      biggest12800=ends[5];
    }
    if(biggest12800 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread12796(int [] tdone, int [] ends){
        S12090=1;
    S12039=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
      S12039=1;
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
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S12794){
        case 0 : 
          S12794=0;
          break RUN;
        
        case 1 : 
          S12794=2;
          S12794=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapper.sysj line: 9, column: 1
            public void run() {//sysj\plantCapper.sysj line: 12, column: 21
              org.compsys704.Capper.main(null);//sysj\plantCapper.sysj line: 13, column: 4
            }
            GUI(){//sysj\plantCapper.sysj line: 11, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapper.sysj line: 16, column: 2
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          thread12796(tdone,ends);
          thread12797(tdone,ends);
          thread12801(tdone,ends);
          thread12802(tdone,ends);
          thread12803(tdone,ends);
          int biggest12814 = 0;
          if(ends[2]>=biggest12814){
            biggest12814=ends[2];
          }
          if(ends[3]>=biggest12814){
            biggest12814=ends[3];
          }
          if(ends[6]>=biggest12814){
            biggest12814=ends[6];
          }
          if(ends[7]>=biggest12814){
            biggest12814=ends[7];
          }
          if(ends[8]>=biggest12814){
            biggest12814=ends[8];
          }
          if(biggest12814 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          thread12815(tdone,ends);
          thread12816(tdone,ends);
          thread12823(tdone,ends);
          thread12824(tdone,ends);
          thread12825(tdone,ends);
          int biggest12836 = 0;
          if(ends[2]>=biggest12836){
            biggest12836=ends[2];
          }
          if(ends[3]>=biggest12836){
            biggest12836=ends[3];
          }
          if(ends[6]>=biggest12836){
            biggest12836=ends[6];
          }
          if(ends[7]>=biggest12836){
            biggest12836=ends[7];
          }
          if(ends[8]>=biggest12836){
            biggest12836=ends[8];
          }
          if(biggest12836 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12836 == 0){
            S12794=0;
            active[1]=0;
            ends[1]=0;
            S12794=0;
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
          jobDone.gethook();
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          enable.gethook();
          enableCapper.gethook();
          df = true;
        }
        runClockDomain();
      }
      jobDone.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      enable.setpreclear();
      enableCapper.setpreclear();
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
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
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
      dummyint = enableCapper.getStatus() ? enableCapper.setprepresent() : enableCapper.setpreclear();
      enableCapper.setpreval(enableCapper.getValue());
      enableCapper.setClear();
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
        jobDone.gethook();
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        enable.gethook();
        enableCapper.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
