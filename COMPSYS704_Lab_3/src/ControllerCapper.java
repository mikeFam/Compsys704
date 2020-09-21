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
  public Signal jobDone = new Signal("jobDone", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S4338 = 1;
  private int S2739 = 1;
  private int S2485 = 1;
  private int S2410 = 1;
  private int S2404 = 1;
  private int S2418 = 1;
  private int S2426 = 1;
  private int S2434 = 1;
  private int S2442 = 1;
  private int S4321 = 1;
  private int S3055 = 1;
  private int S2896 = 1;
  private int S2747 = 1;
  private int S2817 = 1;
  private int S2805 = 1;
  private int S2752 = 1;
  private int S2787 = 1;
  private int S2786 = 1;
  private int S2758 = 1;
  private int S2769 = 1;
  private int S2768 = 1;
  private int S4336 = 1;
  private int S4335 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread4376(int [] tdone, int [] ends){
        switch(S4336){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S4335){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapper.sysj line: 68, column: 9
              S4335=1;
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

  public void thread4372(int [] tdone, int [] ends){
        switch(S2769){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S2768){
          case 0 : 
            if(capGrip.getprestatus()){//sysj\controllerCapper.sysj line: 49, column: 14
              S2768=1;
              if((gripperTurnFinalPos.getprestatus())){//sysj\controllerCapper.sysj line: 50, column: 25
                S2769=0;
                active[14]=0;
                ends[14]=0;
                tdone[14]=1;
              }
              else {
                gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 9
                currsigs.addElement(gripperTurnExtend);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if((gripperTurnFinalPos.getprestatus())){//sysj\controllerCapper.sysj line: 50, column: 25
              S2769=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 9
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

  public void thread4371(int [] tdone, int [] ends){
        switch(S2758){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 46, column: 8
        currsigs.addElement(capGripperPos5Extend);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread4369(int [] tdone, int [] ends){
        S2769=1;
    S2768=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread4368(int [] tdone, int [] ends){
        S2758=1;
    capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 46, column: 8
    currsigs.addElement(capGripperPos5Extend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread4367(int [] tdone, int [] ends){
        switch(S2787){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2786){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\controllerCapper.sysj line: 45, column: 14
              S2786=1;
              thread4368(tdone,ends);
              thread4369(tdone,ends);
              int biggest4370 = 0;
              if(ends[13]>=biggest4370){
                biggest4370=ends[13];
              }
              if(ends[14]>=biggest4370){
                biggest4370=ends[14];
              }
              if(biggest4370 == 1){
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
            thread4371(tdone,ends);
            thread4372(tdone,ends);
            int biggest4373 = 0;
            if(ends[13]>=biggest4373){
              biggest4373=ends[13];
            }
            if(ends[14]>=biggest4373){
              biggest4373=ends[14];
            }
            if(biggest4373 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest4373 == 0){
              S2787=0;
              active[12]=0;
              ends[12]=0;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4366(int [] tdone, int [] ends){
        switch(S2752){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 42, column: 7
        currsigs.addElement(cylPos5ZaxisExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread4365(int [] tdone, int [] ends){
        switch(S2817){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2805){
          case 0 : 
            if((gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus())){//sysj\controllerCapper.sysj line: 40, column: 22
              S2805=1;
              if((gripperTurnHomePos.getprestatus())){//sysj\controllerCapper.sysj line: 56, column: 23
                S2805=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 57, column: 7
                currsigs.addElement(gripperTurnRetract);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              thread4366(tdone,ends);
              thread4367(tdone,ends);
              int biggest4374 = 0;
              if(ends[11]>=biggest4374){
                biggest4374=ends[11];
              }
              if(ends[12]>=biggest4374){
                biggest4374=ends[12];
              }
              if(biggest4374 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest4374 == 0){
                S2805=1;
                if((gripperTurnHomePos.getprestatus())){//sysj\controllerCapper.sysj line: 56, column: 23
                  S2805=2;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 57, column: 7
                  currsigs.addElement(gripperTurnRetract);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            break;
          
          case 1 : 
            if((gripperTurnHomePos.getprestatus())){//sysj\controllerCapper.sysj line: 56, column: 23
              S2805=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 57, column: 7
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\controllerCapper.sysj line: 59, column: 13
              S2805=3;
              jobDone.setPresent();//sysj\controllerCapper.sysj line: 60, column: 6
              currsigs.addElement(jobDone);
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
          
          case 3 : 
            jobDone.setPresent();//sysj\controllerCapper.sysj line: 60, column: 6
            currsigs.addElement(jobDone);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4364(int [] tdone, int [] ends){
        switch(S2747){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((gripperZAxisLifted.getprestatus() && jobDone.getprestatus())){//sysj\controllerCapper.sysj line: 34, column: 23
          S2747=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 35, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread4361(int [] tdone, int [] ends){
        S2787=1;
    S2786=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread4360(int [] tdone, int [] ends){
        S2752=1;
    cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 42, column: 7
    currsigs.addElement(cylPos5ZaxisExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread4359(int [] tdone, int [] ends){
        S2817=1;
    S2805=0;
    if((gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus())){//sysj\controllerCapper.sysj line: 40, column: 22
      S2805=1;
      if((gripperTurnHomePos.getprestatus())){//sysj\controllerCapper.sysj line: 56, column: 23
        S2805=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 57, column: 7
        currsigs.addElement(gripperTurnRetract);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      thread4360(tdone,ends);
      thread4361(tdone,ends);
      int biggest4362 = 0;
      if(ends[11]>=biggest4362){
        biggest4362=ends[11];
      }
      if(ends[12]>=biggest4362){
        biggest4362=ends[12];
      }
      if(biggest4362 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread4358(int [] tdone, int [] ends){
        S2747=1;
    if((gripperZAxisLifted.getprestatus() && jobDone.getprestatus())){//sysj\controllerCapper.sysj line: 34, column: 23
      S2747=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 35, column: 7
      currsigs.addElement(cylClampBottleExtend);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread4357(int [] tdone, int [] ends){
        switch(S4321){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3055){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 29, column: 10
              S3055=1;
              S2896=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 30, column: 10
              S3055=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              switch(S2896){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 31, column: 11
                    S2896=1;
                    thread4358(tdone,ends);
                    thread4359(tdone,ends);
                    int biggest4363 = 0;
                    if(ends[9]>=biggest4363){
                      biggest4363=ends[9];
                    }
                    if(ends[10]>=biggest4363){
                      biggest4363=ends[10];
                    }
                    if(biggest4363 == 1){
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
                  if(!bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 32, column: 11
                    S3055=0;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    thread4364(tdone,ends);
                    thread4365(tdone,ends);
                    int biggest4375 = 0;
                    if(ends[9]>=biggest4375){
                      biggest4375=ends[9];
                    }
                    if(ends[10]>=biggest4375){
                      biggest4375=ends[10];
                    }
                    if(biggest4375 == 1){
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    //FINXME code
                    if(biggest4375 == 0){
                      S3055=0;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4355(int [] tdone, int [] ends){
        switch(S2442){
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

  public void thread4354(int [] tdone, int [] ends){
        switch(S2434){
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

  public void thread4353(int [] tdone, int [] ends){
        switch(S2426){
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

  public void thread4352(int [] tdone, int [] ends){
        switch(S2418){
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

  public void thread4351(int [] tdone, int [] ends){
        switch(S2410){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2404){
          case 0 : 
            S2404=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S2404=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2404=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S2404=1;
            S2404=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S2404=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2404=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4349(int [] tdone, int [] ends){
        S2442=1;
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

  public void thread4348(int [] tdone, int [] ends){
        S2434=1;
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

  public void thread4347(int [] tdone, int [] ends){
        S2426=1;
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

  public void thread4346(int [] tdone, int [] ends){
        S2418=1;
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

  public void thread4345(int [] tdone, int [] ends){
        S2410=1;
    S2404=0;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 26
      cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 14, column: 47
      currsigs.addElement(cylPos5ZaxisExtend);
      S2404=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2404=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread4344(int [] tdone, int [] ends){
        switch(S2739){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2485){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 12, column: 10
              S2485=1;
              thread4345(tdone,ends);
              thread4346(tdone,ends);
              thread4347(tdone,ends);
              thread4348(tdone,ends);
              thread4349(tdone,ends);
              int biggest4350 = 0;
              if(ends[3]>=biggest4350){
                biggest4350=ends[3];
              }
              if(ends[4]>=biggest4350){
                biggest4350=ends[4];
              }
              if(ends[5]>=biggest4350){
                biggest4350=ends[5];
              }
              if(ends[6]>=biggest4350){
                biggest4350=ends[6];
              }
              if(ends[7]>=biggest4350){
                biggest4350=ends[7];
              }
              if(biggest4350 == 1){
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
              S2485=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread4351(tdone,ends);
              thread4352(tdone,ends);
              thread4353(tdone,ends);
              thread4354(tdone,ends);
              thread4355(tdone,ends);
              int biggest4356 = 0;
              if(ends[3]>=biggest4356){
                biggest4356=ends[3];
              }
              if(ends[4]>=biggest4356){
                biggest4356=ends[4];
              }
              if(ends[5]>=biggest4356){
                biggest4356=ends[5];
              }
              if(ends[6]>=biggest4356){
                biggest4356=ends[6];
              }
              if(ends[7]>=biggest4356){
                biggest4356=ends[7];
              }
              if(biggest4356 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest4356 == 0){
                S2485=0;
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

  public void thread4342(int [] tdone, int [] ends){
        S4336=1;
    S4335=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread4341(int [] tdone, int [] ends){
        S4321=1;
    S3055=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4340(int [] tdone, int [] ends){
        S2739=1;
    S2485=0;
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
      switch(S4338){
        case 0 : 
          S4338=0;
          break RUN;
        
        case 1 : 
          S4338=2;
          S4338=2;
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread4340(tdone,ends);
          thread4341(tdone,ends);
          thread4342(tdone,ends);
          int biggest4343 = 0;
          if(ends[2]>=biggest4343){
            biggest4343=ends[2];
          }
          if(ends[8]>=biggest4343){
            biggest4343=ends[8];
          }
          if(ends[15]>=biggest4343){
            biggest4343=ends[15];
          }
          if(biggest4343 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread4344(tdone,ends);
          thread4357(tdone,ends);
          thread4376(tdone,ends);
          int biggest4377 = 0;
          if(ends[2]>=biggest4377){
            biggest4377=ends[2];
          }
          if(ends[8]>=biggest4377){
            biggest4377=ends[8];
          }
          if(ends[15]>=biggest4377){
            biggest4377=ends[15];
          }
          if(biggest4377 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4377 == 0){
            S4338=0;
            active[1]=0;
            ends[1]=0;
            S4338=0;
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
      jobDone.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
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
      jobDone.sethook();
      jobDone.setClear();
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
