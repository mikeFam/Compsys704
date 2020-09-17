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
  public Signal capGrip = new Signal("capGrip", Signal.INPUT);
  public Signal capNotGrip = new Signal("capNotGrip", Signal.INPUT);
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
  private int S7358 = 1;
  private int S2019 = 1;
  private int S1765 = 1;
  private int S1690 = 1;
  private int S1684 = 1;
  private int S1698 = 1;
  private int S1706 = 1;
  private int S1714 = 1;
  private int S1722 = 1;
  private int S7341 = 1;
  private int S3349 = 1;
  private int S2351 = 1;
  private int S2032 = 1;
  private int S2186 = 1;
  private int S2159 = 1;
  private int S2037 = 1;
  private int S2094 = 1;
  private int S2093 = 1;
  private int S2046 = 1;
  private int S2065 = 1;
  private int S2048 = 1;
  private int S7356 = 1;
  private int S7355 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread7396(int [] tdone, int [] ends){
        switch(S7356){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S7355){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapper.sysj line: 73, column: 9
              S7355=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 75, column: 7
                selectM_1.setPresent();//sysj\controllerCapper.sysj line: 76, column: 5
                currsigs.addElement(selectM_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerCapper.sysj line: 79, column: 5
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 75, column: 7
              selectM_1.setPresent();//sysj\controllerCapper.sysj line: 76, column: 5
              currsigs.addElement(selectM_1);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerCapper.sysj line: 79, column: 5
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

  public void thread7392(int [] tdone, int [] ends){
        switch(S2065){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S2048){
          case 0 : 
            if(capGrip.getprestatus()){//sysj\controllerCapper.sysj line: 49, column: 15
              System.out.println("CapGrip");//sysj\controllerCapper.sysj line: 50, column: 8
              S2048=1;
              System.out.println("Cap turned");//sysj\controllerCapper.sysj line: 52, column: 9
              gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 53, column: 9
              currsigs.addElement(gripperTurnExtend);
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controllerCapper.sysj line: 51, column: 15
              S2065=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 53, column: 9
              currsigs.addElement(gripperTurnExtend);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7391(int [] tdone, int [] ends){
        switch(S2046){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 47, column: 7
        currsigs.addElement(capGripperPos5Extend);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread7389(int [] tdone, int [] ends){
        S2065=1;
    S2048=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread7388(int [] tdone, int [] ends){
        S2046=1;
    System.out.println("Cap gripping");//sysj\controllerCapper.sysj line: 46, column: 8
    capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 47, column: 7
    currsigs.addElement(capGripperPos5Extend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7387(int [] tdone, int [] ends){
        switch(S2094){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2093){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\controllerCapper.sysj line: 45, column: 14
              S2093=1;
              thread7388(tdone,ends);
              thread7389(tdone,ends);
              int biggest7390 = 0;
              if(ends[13]>=biggest7390){
                biggest7390=ends[13];
              }
              if(ends[14]>=biggest7390){
                biggest7390=ends[14];
              }
              if(biggest7390 == 1){
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
            thread7391(tdone,ends);
            thread7392(tdone,ends);
            int biggest7393 = 0;
            if(ends[13]>=biggest7393){
              biggest7393=ends[13];
            }
            if(ends[14]>=biggest7393){
              biggest7393=ends[14];
            }
            if(biggest7393 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest7393 == 0){
              S2094=0;
              active[12]=0;
              ends[12]=0;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7386(int [] tdone, int [] ends){
        switch(S2037){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 43, column: 7
        currsigs.addElement(cylPos5ZaxisExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread7385(int [] tdone, int [] ends){
        switch(S2186){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2159){
          case 0 : 
            if(gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus()){//sysj\controllerCapper.sysj line: 41, column: 12
              System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 58, column: 5
              S2159=1;
              System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 60, column: 6
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 61, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              thread7386(tdone,ends);
              thread7387(tdone,ends);
              int biggest7394 = 0;
              if(ends[11]>=biggest7394){
                biggest7394=ends[11];
              }
              if(ends[12]>=biggest7394){
                biggest7394=ends[12];
              }
              if(biggest7394 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest7394 == 0){
                System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 58, column: 5
                S2159=1;
                System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 60, column: 6
                gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 61, column: 6
                currsigs.addElement(gripperTurnRetract);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
          case 1 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\controllerCapper.sysj line: 59, column: 12
              System.out.println("Gripper untwisted");//sysj\controllerCapper.sysj line: 63, column: 5
              S2159=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 61, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\controllerCapper.sysj line: 64, column: 12
              System.out.println("Gripper lifted");//sysj\controllerCapper.sysj line: 65, column: 5
              jobDone_1.setPresent();//sysj\controllerCapper.sysj line: 66, column: 5
              currsigs.addElement(jobDone_1);
              S2186=0;
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

  public void thread7384(int [] tdone, int [] ends){
        switch(S2032){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 34, column: 23
          System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 38, column: 5
          S2032=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 36, column: 6
          currsigs.addElement(cylClampBottleExtend);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread7381(int [] tdone, int [] ends){
        S2094=1;
    S2093=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7380(int [] tdone, int [] ends){
        S2037=1;
    cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 43, column: 7
    currsigs.addElement(cylPos5ZaxisExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7379(int [] tdone, int [] ends){
        S2186=1;
    S2159=0;
    System.out.println("Gripper lowering");//sysj\controllerCapper.sysj line: 42, column: 6
    thread7380(tdone,ends);
    thread7381(tdone,ends);
    int biggest7382 = 0;
    if(ends[11]>=biggest7382){
      biggest7382=ends[11];
    }
    if(ends[12]>=biggest7382){
      biggest7382=ends[12];
    }
    if(biggest7382 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread7378(int [] tdone, int [] ends){
        S2032=1;
    if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 34, column: 23
      System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 38, column: 5
      S2032=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      System.out.println("Bottle Clamped");//sysj\controllerCapper.sysj line: 35, column: 6
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 36, column: 6
      currsigs.addElement(cylClampBottleExtend);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread7377(int [] tdone, int [] ends){
        switch(S7341){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3349){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 29, column: 10
              S3349=1;
              jobDone_1.setClear();//sysj\controllerCapper.sysj line: 30, column: 4
              System.out.println("Auto Mode");//sysj\controllerCapper.sysj line: 31, column: 4
              S2351=0;
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
            jobDone_1.setClear();//sysj\controllerCapper.sysj line: 30, column: 4
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 32, column: 10
              S3349=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              switch(S2351){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 33, column: 11
                    S2351=1;
                    thread7378(tdone,ends);
                    thread7379(tdone,ends);
                    int biggest7383 = 0;
                    if(ends[9]>=biggest7383){
                      biggest7383=ends[9];
                    }
                    if(ends[10]>=biggest7383){
                      biggest7383=ends[10];
                    }
                    if(biggest7383 == 1){
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
                  thread7384(tdone,ends);
                  thread7385(tdone,ends);
                  int biggest7395 = 0;
                  if(ends[9]>=biggest7395){
                    biggest7395=ends[9];
                  }
                  if(ends[10]>=biggest7395){
                    biggest7395=ends[10];
                  }
                  if(biggest7395 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  //FINXME code
                  if(biggest7395 == 0){
                    S3349=0;
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

  public void thread7375(int [] tdone, int [] ends){
        switch(S1722){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 22, column: 26
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 22, column: 49
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

  public void thread7374(int [] tdone, int [] ends){
        switch(S1714){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 20, column: 26
          capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 20, column: 49
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

  public void thread7373(int [] tdone, int [] ends){
        switch(S1706){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 18, column: 26
          gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 18, column: 46
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

  public void thread7372(int [] tdone, int [] ends){
        switch(S1698){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 16, column: 26
          gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 16, column: 47
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

  public void thread7371(int [] tdone, int [] ends){
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
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
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
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
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

  public void thread7369(int [] tdone, int [] ends){
        S1722=1;
    if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 22, column: 26
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 22, column: 49
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

  public void thread7368(int [] tdone, int [] ends){
        S1714=1;
    if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 20, column: 26
      capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 20, column: 49
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

  public void thread7367(int [] tdone, int [] ends){
        S1706=1;
    if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 18, column: 26
      gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 18, column: 46
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

  public void thread7366(int [] tdone, int [] ends){
        S1698=1;
    if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 16, column: 26
      gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 16, column: 47
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

  public void thread7365(int [] tdone, int [] ends){
        S1690=1;
    S1684=0;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
      cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
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

  public void thread7364(int [] tdone, int [] ends){
        switch(S2019){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1765){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 12, column: 10
              S1765=1;
              thread7365(tdone,ends);
              thread7366(tdone,ends);
              thread7367(tdone,ends);
              thread7368(tdone,ends);
              thread7369(tdone,ends);
              int biggest7370 = 0;
              if(ends[3]>=biggest7370){
                biggest7370=ends[3];
              }
              if(ends[4]>=biggest7370){
                biggest7370=ends[4];
              }
              if(ends[5]>=biggest7370){
                biggest7370=ends[5];
              }
              if(ends[6]>=biggest7370){
                biggest7370=ends[6];
              }
              if(ends[7]>=biggest7370){
                biggest7370=ends[7];
              }
              if(biggest7370 == 1){
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
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 13, column: 10
              S1765=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread7371(tdone,ends);
              thread7372(tdone,ends);
              thread7373(tdone,ends);
              thread7374(tdone,ends);
              thread7375(tdone,ends);
              int biggest7376 = 0;
              if(ends[3]>=biggest7376){
                biggest7376=ends[3];
              }
              if(ends[4]>=biggest7376){
                biggest7376=ends[4];
              }
              if(ends[5]>=biggest7376){
                biggest7376=ends[5];
              }
              if(ends[6]>=biggest7376){
                biggest7376=ends[6];
              }
              if(ends[7]>=biggest7376){
                biggest7376=ends[7];
              }
              if(biggest7376 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest7376 == 0){
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

  public void thread7362(int [] tdone, int [] ends){
        S7356=1;
    S7355=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread7361(int [] tdone, int [] ends){
        S7341=1;
    S3349=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread7360(int [] tdone, int [] ends){
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
      switch(S7358){
        case 0 : 
          S7358=0;
          break RUN;
        
        case 1 : 
          S7358=2;
          S7358=2;
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread7360(tdone,ends);
          thread7361(tdone,ends);
          thread7362(tdone,ends);
          int biggest7363 = 0;
          if(ends[2]>=biggest7363){
            biggest7363=ends[2];
          }
          if(ends[8]>=biggest7363){
            biggest7363=ends[8];
          }
          if(ends[15]>=biggest7363){
            biggest7363=ends[15];
          }
          if(biggest7363 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread7364(tdone,ends);
          thread7377(tdone,ends);
          thread7396(tdone,ends);
          int biggest7397 = 0;
          if(ends[2]>=biggest7397){
            biggest7397=ends[2];
          }
          if(ends[8]>=biggest7397){
            biggest7397=ends[8];
          }
          if(ends[15]>=biggest7397){
            biggest7397=ends[15];
          }
          if(biggest7397 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7397 == 0){
            S7358=0;
            active[1]=0;
            ends[1]=0;
            S7358=0;
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
          capGrip.gethook();
          capNotGrip.gethook();
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
      capGrip.setpreclear();
      capNotGrip.setpreclear();
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
      dummyint = capGrip.getStatus() ? capGrip.setprepresent() : capGrip.setpreclear();
      capGrip.setpreval(capGrip.getValue());
      capGrip.setClear();
      dummyint = capNotGrip.getStatus() ? capNotGrip.setprepresent() : capNotGrip.setpreclear();
      capNotGrip.setpreval(capNotGrip.getValue());
      capNotGrip.setClear();
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
        capGrip.gethook();
        capNotGrip.gethook();
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
