import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerCapper extends ClockDomain{
  public ControllerCapper(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal cylPos5ZaxisExtendM = new Signal("cylPos5ZaxisExtendM", Signal.INPUT);
  public Signal gripperTurnRetractM = new Signal("gripperTurnRetractM", Signal.INPUT);
  public Signal gripperTurnExtendM = new Signal("gripperTurnExtendM", Signal.INPUT);
  public Signal capGripperPos5ExtendM = new Signal("capGripperPos5ExtendM", Signal.INPUT);
  public Signal cylClampBottleExtendM = new Signal("cylClampBottleExtendM", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private Signal jobDone_1;
  private int S5950 = 1;
  private int S2019 = 1;
  private int S1765 = 1;
  private int S1690 = 1;
  private int S1684 = 1;
  private int S1698 = 1;
  private int S1706 = 1;
  private int S1714 = 1;
  private int S1722 = 1;
  private int S5933 = 1;
  private int S2997 = 1;
  private int S2263 = 1;
  private int S2032 = 1;
  private int S2142 = 1;
  private int S2115 = 1;
  private int S2037 = 1;
  private int S2072 = 1;
  private int S2071 = 1;
  private int S2046 = 1;
  private int S2054 = 1;
  private int S5948 = 1;
  private int S5947 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread5988(int [] tdone, int [] ends){
        switch(S5948){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S5947){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapper.sysj line: 68, column: 9
              S5947=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 70, column: 7
                selectM_1.setPresent();//sysj\controllerCapper.sysj line: 71, column: 5
                currsigs.addElement(selectM_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerCapper.sysj line: 74, column: 5
                currsigs.addElement(selectA_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 70, column: 7
              selectM_1.setPresent();//sysj\controllerCapper.sysj line: 71, column: 5
              currsigs.addElement(selectM_1);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerCapper.sysj line: 74, column: 5
              currsigs.addElement(selectA_1);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5984(int [] tdone, int [] ends){
        switch(S2054){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 6
        currsigs.addElement(capGripperPos5Extend);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread5983(int [] tdone, int [] ends){
        switch(S2046){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 48, column: 6
        currsigs.addElement(gripperTurnExtend);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread5981(int [] tdone, int [] ends){
        S2054=1;
    System.out.println("Cap gripped");//sysj\controllerCapper.sysj line: 50, column: 7
    capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 6
    currsigs.addElement(capGripperPos5Extend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread5980(int [] tdone, int [] ends){
        S2046=1;
    System.out.println("Gripper twisting");//sysj\controllerCapper.sysj line: 47, column: 7
    gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 48, column: 6
    currsigs.addElement(gripperTurnExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread5979(int [] tdone, int [] ends){
        switch(S2072){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2071){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\controllerCapper.sysj line: 46, column: 14
              S2071=1;
              thread5980(tdone,ends);
              thread5981(tdone,ends);
              int biggest5982 = 0;
              if(ends[13]>=biggest5982){
                biggest5982=ends[13];
              }
              if(ends[14]>=biggest5982){
                biggest5982=ends[14];
              }
              if(biggest5982 == 1){
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
          
          case 1 : 
            thread5983(tdone,ends);
            thread5984(tdone,ends);
            int biggest5985 = 0;
            if(ends[13]>=biggest5985){
              biggest5985=ends[13];
            }
            if(ends[14]>=biggest5985){
              biggest5985=ends[14];
            }
            if(biggest5985 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest5985 == 0){
              S2072=0;
              active[12]=0;
              ends[12]=0;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5978(int [] tdone, int [] ends){
        switch(S2037){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 44, column: 7
        currsigs.addElement(cylPos5ZaxisExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread5977(int [] tdone, int [] ends){
        switch(S2142){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2115){
          case 0 : 
            if(gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus()){//sysj\controllerCapper.sysj line: 42, column: 12
              System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 53, column: 5
              S2115=1;
              System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 55, column: 6
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              thread5978(tdone,ends);
              thread5979(tdone,ends);
              int biggest5986 = 0;
              if(ends[11]>=biggest5986){
                biggest5986=ends[11];
              }
              if(ends[12]>=biggest5986){
                biggest5986=ends[12];
              }
              if(biggest5986 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest5986 == 0){
                System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 53, column: 5
                S2115=1;
                System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 55, column: 6
                gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
                currsigs.addElement(gripperTurnRetract);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
          case 1 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\controllerCapper.sysj line: 54, column: 12
              System.out.println("Gripper untwisted");//sysj\controllerCapper.sysj line: 58, column: 5
              S2115=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\controllerCapper.sysj line: 59, column: 12
              System.out.println("Gripper lifted");//sysj\controllerCapper.sysj line: 60, column: 5
              jobDone_1.setPresent();//sysj\controllerCapper.sysj line: 61, column: 5
              currsigs.addElement(jobDone_1);
              S2142=0;
              active[10]=0;
              ends[10]=0;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5976(int [] tdone, int [] ends){
        switch(S2032){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 35, column: 23
          System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 39, column: 5
          S2032=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 37, column: 6
          currsigs.addElement(cylClampBottleExtend);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread5973(int [] tdone, int [] ends){
        S2072=1;
    S2071=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread5972(int [] tdone, int [] ends){
        S2037=1;
    cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 44, column: 7
    currsigs.addElement(cylPos5ZaxisExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread5971(int [] tdone, int [] ends){
        S2142=1;
    S2115=0;
    System.out.println("Gripper lowering");//sysj\controllerCapper.sysj line: 43, column: 6
    thread5972(tdone,ends);
    thread5973(tdone,ends);
    int biggest5974 = 0;
    if(ends[11]>=biggest5974){
      biggest5974=ends[11];
    }
    if(ends[12]>=biggest5974){
      biggest5974=ends[12];
    }
    if(biggest5974 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread5970(int [] tdone, int [] ends){
        S2032=1;
    if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 35, column: 23
      System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 39, column: 5
      S2032=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      System.out.println("Bottle Clamped");//sysj\controllerCapper.sysj line: 36, column: 6
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 37, column: 6
      currsigs.addElement(cylClampBottleExtend);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread5969(int [] tdone, int [] ends){
        switch(S5933){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2997){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 30, column: 10
              S2997=1;
              jobDone_1.setClear();//sysj\controllerCapper.sysj line: 31, column: 4
              System.out.println("Auto Mode");//sysj\controllerCapper.sysj line: 32, column: 4
              S2263=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            jobDone_1.setClear();//sysj\controllerCapper.sysj line: 31, column: 4
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 33, column: 10
              S2997=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              switch(S2263){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 34, column: 11
                    S2263=1;
                    thread5970(tdone,ends);
                    thread5971(tdone,ends);
                    int biggest5975 = 0;
                    if(ends[9]>=biggest5975){
                      biggest5975=ends[9];
                    }
                    if(ends[10]>=biggest5975){
                      biggest5975=ends[10];
                    }
                    if(biggest5975 == 1){
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
                case 1 : 
                  thread5976(tdone,ends);
                  thread5977(tdone,ends);
                  int biggest5987 = 0;
                  if(ends[9]>=biggest5987){
                    biggest5987=ends[9];
                  }
                  if(ends[10]>=biggest5987){
                    biggest5987=ends[10];
                  }
                  if(biggest5987 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  //FINXME code
                  if(biggest5987 == 0){
                    S2997=0;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5967(int [] tdone, int [] ends){
        switch(S1722){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 23, column: 26
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 23, column: 49
          currsigs.addElement(cylClampBottleExtend);
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

  public void thread5966(int [] tdone, int [] ends){
        switch(S1714){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 21, column: 26
          capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 21, column: 49
          currsigs.addElement(capGripperPos5Extend);
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

  public void thread5965(int [] tdone, int [] ends){
        switch(S1706){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 19, column: 26
          gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 19, column: 46
          currsigs.addElement(gripperTurnExtend);
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
  }

  public void thread5964(int [] tdone, int [] ends){
        switch(S1698){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 17, column: 26
          gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 17, column: 47
          currsigs.addElement(gripperTurnRetract);
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
  }

  public void thread5963(int [] tdone, int [] ends){
        switch(S1690){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1684){
          case 0 : 
            S1684=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S1684=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1684=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1684=1;
            S1684=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S1684=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1684=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5961(int [] tdone, int [] ends){
        S1722=1;
    if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 23, column: 26
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 23, column: 49
      currsigs.addElement(cylClampBottleExtend);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread5960(int [] tdone, int [] ends){
        S1714=1;
    if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 21, column: 26
      capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 21, column: 49
      currsigs.addElement(capGripperPos5Extend);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread5959(int [] tdone, int [] ends){
        S1706=1;
    if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 19, column: 26
      gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 19, column: 46
      currsigs.addElement(gripperTurnExtend);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread5958(int [] tdone, int [] ends){
        S1698=1;
    if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 17, column: 26
      gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 17, column: 47
      currsigs.addElement(gripperTurnRetract);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread5957(int [] tdone, int [] ends){
        S1690=1;
    S1684=0;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
      cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
      currsigs.addElement(cylPos5ZaxisExtend);
      S1684=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S1684=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5956(int [] tdone, int [] ends){
        switch(S2019){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1765){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 13, column: 10
              S1765=1;
              thread5957(tdone,ends);
              thread5958(tdone,ends);
              thread5959(tdone,ends);
              thread5960(tdone,ends);
              thread5961(tdone,ends);
              int biggest5962 = 0;
              if(ends[3]>=biggest5962){
                biggest5962=ends[3];
              }
              if(ends[4]>=biggest5962){
                biggest5962=ends[4];
              }
              if(ends[5]>=biggest5962){
                biggest5962=ends[5];
              }
              if(ends[6]>=biggest5962){
                biggest5962=ends[6];
              }
              if(ends[7]>=biggest5962){
                biggest5962=ends[7];
              }
              if(biggest5962 == 1){
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
          
          case 1 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 10
              S1765=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread5963(tdone,ends);
              thread5964(tdone,ends);
              thread5965(tdone,ends);
              thread5966(tdone,ends);
              thread5967(tdone,ends);
              int biggest5968 = 0;
              if(ends[3]>=biggest5968){
                biggest5968=ends[3];
              }
              if(ends[4]>=biggest5968){
                biggest5968=ends[4];
              }
              if(ends[5]>=biggest5968){
                biggest5968=ends[5];
              }
              if(ends[6]>=biggest5968){
                biggest5968=ends[6];
              }
              if(ends[7]>=biggest5968){
                biggest5968=ends[7];
              }
              if(biggest5968 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest5968 == 0){
                S1765=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5954(int [] tdone, int [] ends){
        S5948=1;
    S5947=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread5953(int [] tdone, int [] ends){
        S5933=1;
    S2997=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5952(int [] tdone, int [] ends){
        S2019=1;
    S1765=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5950){
        case 0 : 
          S5950=0;
          break RUN;
        
        case 1 : 
          S5950=2;
          S5950=2;
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread5952(tdone,ends);
          thread5953(tdone,ends);
          thread5954(tdone,ends);
          int biggest5955 = 0;
          if(ends[2]>=biggest5955){
            biggest5955=ends[2];
          }
          if(ends[8]>=biggest5955){
            biggest5955=ends[8];
          }
          if(ends[15]>=biggest5955){
            biggest5955=ends[15];
          }
          if(biggest5955 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread5956(tdone,ends);
          thread5969(tdone,ends);
          thread5988(tdone,ends);
          int biggest5989 = 0;
          if(ends[2]>=biggest5989){
            biggest5989=ends[2];
          }
          if(ends[8]>=biggest5989){
            biggest5989=ends[8];
          }
          if(ends[15]>=biggest5989){
            biggest5989=ends[15];
          }
          if(biggest5989 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5989 == 0){
            S5950=0;
            active[1]=0;
            ends[1]=0;
            S5950=0;
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
    selectM_1 = new Signal();
    selectA_1 = new Signal();
    jobDone_1 = new Signal();
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          mode.gethook();
          cylPos5ZaxisExtendM.gethook();
          gripperTurnRetractM.gethook();
          gripperTurnExtendM.gethook();
          capGripperPos5ExtendM.gethook();
          cylClampBottleExtendM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      mode.setpreclear();
      cylPos5ZaxisExtendM.setpreclear();
      gripperTurnRetractM.setpreclear();
      gripperTurnExtendM.setpreclear();
      capGripperPos5ExtendM.setpreclear();
      cylClampBottleExtendM.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      jobDone_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = cylPos5ZaxisExtendM.getStatus() ? cylPos5ZaxisExtendM.setprepresent() : cylPos5ZaxisExtendM.setpreclear();
      cylPos5ZaxisExtendM.setpreval(cylPos5ZaxisExtendM.getValue());
      cylPos5ZaxisExtendM.setClear();
      dummyint = gripperTurnRetractM.getStatus() ? gripperTurnRetractM.setprepresent() : gripperTurnRetractM.setpreclear();
      gripperTurnRetractM.setpreval(gripperTurnRetractM.getValue());
      gripperTurnRetractM.setClear();
      dummyint = gripperTurnExtendM.getStatus() ? gripperTurnExtendM.setprepresent() : gripperTurnExtendM.setpreclear();
      gripperTurnExtendM.setpreval(gripperTurnExtendM.getValue());
      gripperTurnExtendM.setClear();
      dummyint = capGripperPos5ExtendM.getStatus() ? capGripperPos5ExtendM.setprepresent() : capGripperPos5ExtendM.setpreclear();
      capGripperPos5ExtendM.setpreval(capGripperPos5ExtendM.getValue());
      capGripperPos5ExtendM.setClear();
      dummyint = cylClampBottleExtendM.getStatus() ? cylClampBottleExtendM.setprepresent() : cylClampBottleExtendM.setpreclear();
      cylClampBottleExtendM.setpreval(cylClampBottleExtendM.getValue());
      cylClampBottleExtendM.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      jobDone_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
        mode.gethook();
        cylPos5ZaxisExtendM.gethook();
        gripperTurnRetractM.gethook();
        gripperTurnExtendM.gethook();
        capGripperPos5ExtendM.gethook();
        cylClampBottleExtendM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
