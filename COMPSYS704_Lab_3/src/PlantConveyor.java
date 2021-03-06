import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantConveyor extends ClockDomain{
  public PlantConveyor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtLoadE = new Signal("bottleAtLoadE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAtL_1;
  private Signal bottleAt5_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottlePos_1;
  private int bottlecount_thread_5;//sysj\plantConveyor.sysj line: 88, column: 3
  private int data_thread_3;//sysj\plantConveyor.sysj line: 36, column: 3
  private int S14564 = 1;
  private int S12940 = 1;
  private int S12857 = 1;
  private int S13107 = 1;
  private int S12995 = 1;
  private int S12967 = 1;
  private int S12966 = 1;
  private int S13184 = 1;
  private int S13132 = 1;
  private int S13108 = 1;
  private int S13246 = 1;
  private int S13189 = 1;
  private int S13272 = 1;
  private int S13254 = 1;
  private int S13262 = 1;
  private int S13270 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread14583(int [] tdone, int [] ends){
        switch(S13270){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 108, column: 24
          bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 108, column: 38
          currsigs.addElement(bottleAtLoadE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread14582(int [] tdone, int [] ends){
        switch(S13262){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 106, column: 24
          bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 106, column: 40
          currsigs.addElement(bottleLeftPos5E);
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
      
    }
  }

  public void thread14581(int [] tdone, int [] ends){
        switch(S13254){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 104, column: 24
          bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 104, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread14580(int [] tdone, int [] ends){
        switch(S13272){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread14581(tdone,ends);
        thread14582(tdone,ends);
        thread14583(tdone,ends);
        int biggest14584 = 0;
        if(ends[7]>=biggest14584){
          biggest14584=ends[7];
        }
        if(ends[8]>=biggest14584){
          biggest14584=ends[8];
        }
        if(ends[9]>=biggest14584){
          biggest14584=ends[9];
        }
        if(biggest14584 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest14584 == 0){
          S13272=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread14579(int [] tdone, int [] ends){
        switch(S13246){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S13189){
          case 0 : 
            S13189=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 90, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 91, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 92, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S13189=1;
            S13189=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 90, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 91, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 92, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
                  currsigs.addElement(empty_1);
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S13189=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread14578(int [] tdone, int [] ends){
        switch(S13184){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S13132){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantConveyor.sysj line: 68, column: 10
              S13132=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S13108){
                case 0 : 
                  if(motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 72, column: 12
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 74, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantConveyor.sysj line: 74, column: 6
                    bottleAt1_1.setPresent();//sysj\plantConveyor.sysj line: 75, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S13108=1;
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
                  if(enable.getprestatus() && motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 76, column: 13
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 77, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantConveyor.sysj line: 77, column: 6
                    bottleAt5_1.setPresent();//sysj\plantConveyor.sysj line: 78, column: 6
                    currsigs.addElement(bottleAt5_1);
                    S13108=2;
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
                  if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 79, column: 13
                    bottleDec_1.setPresent();//sysj\plantConveyor.sysj line: 80, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 70, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 70, column: 6
                    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 71, column: 6
                    currsigs.addElement(bottleAtL_1);
                    S13108=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 10
              S13132=0;
              bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 70, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 70, column: 6
              bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 71, column: 6
              currsigs.addElement(bottleAtL_1);
              S13108=0;
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

  public void thread14577(int [] tdone, int [] ends){
        switch(S13107){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S12995){
          case 0 : 
            switch(S12967){
              case 0 : 
                if(bottleAt1_1.getprestatus()){//sysj\plantConveyor.sysj line: 38, column: 11
                  S12995=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
                  currsigs.addElement(bottleAtLoad);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                switch(S12966){
                  case 0 : 
                    if(bottleAt5_1.getprestatus()){//sysj\plantConveyor.sysj line: 44, column: 11
                      S12995=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 46, column: 6
                      currsigs.addElement(bottleAtPos1);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(bottleAtL_1.getprestatus()){//sysj\plantConveyor.sysj line: 50, column: 11
                      S12995=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 52, column: 6
                      currsigs.addElement(bottleLeftPos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S12995=1;
            data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 36, column: 3
            S12995=0;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantConveyor.sysj line: 37, column: 7
              S12967=0;
              System.out.println("bottleAtLoad");//sysj\plantConveyor.sysj line: 39, column: 6
              bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
              currsigs.addElement(bottleAtLoad);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S12967=1;
              if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 43, column: 12
                S12966=0;
                System.out.println("bottleAtPos1");//sysj\plantConveyor.sysj line: 45, column: 6
                bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 46, column: 6
                currsigs.addElement(bottleAtPos1);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S12966=1;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 49, column: 12
                  System.out.println("bottleLeftPos5");//sysj\plantConveyor.sysj line: 51, column: 6
                  bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 52, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S12995=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread14576(int [] tdone, int [] ends){
        switch(S12940){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12857){
          case 0 : 
            if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
              S12857=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 25, column: 10
              S12857=2;
              if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 26, column: 20
                S12857=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOn");//sysj\plantConveyor.sysj line: 27, column: 5
                motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 28, column: 5
                currsigs.addElement(motorOn_1);
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
            if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 26, column: 20
              S12857=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 28, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 30, column: 10
              S12857=0;
              if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
                S12857=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\plantConveyor.sysj line: 22, column: 5
                motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
                currsigs.addElement(motorOff_1);
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

  public void thread14573(int [] tdone, int [] ends){
        S13270=1;
    if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 108, column: 24
      bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 108, column: 38
      currsigs.addElement(bottleAtLoadE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread14572(int [] tdone, int [] ends){
        S13262=1;
    if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 106, column: 24
      bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 106, column: 40
      currsigs.addElement(bottleLeftPos5E);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread14571(int [] tdone, int [] ends){
        S13254=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 104, column: 24
      bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 104, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread14570(int [] tdone, int [] ends){
        S13272=1;
    thread14571(tdone,ends);
    thread14572(tdone,ends);
    thread14573(tdone,ends);
    int biggest14574 = 0;
    if(ends[7]>=biggest14574){
      biggest14574=ends[7];
    }
    if(ends[8]>=biggest14574){
      biggest14574=ends[8];
    }
    if(ends[9]>=biggest14574){
      biggest14574=ends[9];
    }
    if(biggest14574 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread14569(int [] tdone, int [] ends){
        S13246=1;
    bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 88, column: 3
    S13189=0;
    if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 90, column: 12
      if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 91, column: 5
        bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 92, column: 6
      }
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
          currsigs.addElement(empty_1);
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
          currsigs.addElement(empty_1);
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 94, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 95, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
          currsigs.addElement(empty_1);
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 97, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 98, column: 4
          currsigs.addElement(empty_1);
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S13189=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread14568(int [] tdone, int [] ends){
        S13184=1;
    S13132=0;
    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 70, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 70, column: 6
    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 71, column: 6
    currsigs.addElement(bottleAtL_1);
    S13108=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread14567(int [] tdone, int [] ends){
        S13107=1;
    data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 36, column: 3
    S12995=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantConveyor.sysj line: 37, column: 7
      S12967=0;
      System.out.println("bottleAtLoad");//sysj\plantConveyor.sysj line: 39, column: 6
      bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
      currsigs.addElement(bottleAtLoad);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S12967=1;
      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 43, column: 12
        S12966=0;
        System.out.println("bottleAtPos1");//sysj\plantConveyor.sysj line: 45, column: 6
        bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 46, column: 6
        currsigs.addElement(bottleAtPos1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S12966=1;
        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 49, column: 12
          System.out.println("bottleLeftPos5");//sysj\plantConveyor.sysj line: 51, column: 6
          bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 52, column: 6
          currsigs.addElement(bottleLeftPos5);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S12995=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
    }
  }

  public void thread14566(int [] tdone, int [] ends){
        S12940=1;
    S12857=0;
    if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
      S12857=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\plantConveyor.sysj line: 22, column: 5
      motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
      currsigs.addElement(motorOff_1);
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
      switch(S14564){
        case 0 : 
          S14564=0;
          break RUN;
        
        case 1 : 
          S14564=2;
          S14564=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantConveyor.sysj line: 8, column: 1
            public void run() {//sysj\plantConveyor.sysj line: 10, column: 21
              org.compsys704.Conveyor.main(null);//sysj\plantConveyor.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantConveyor.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantConveyor.sysj line: 14, column: 2
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 17, column: 2
          bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 18, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 18, column: 2
          thread14566(tdone,ends);
          thread14567(tdone,ends);
          thread14568(tdone,ends);
          thread14569(tdone,ends);
          thread14570(tdone,ends);
          int biggest14575 = 0;
          if(ends[2]>=biggest14575){
            biggest14575=ends[2];
          }
          if(ends[3]>=biggest14575){
            biggest14575=ends[3];
          }
          if(ends[4]>=biggest14575){
            biggest14575=ends[4];
          }
          if(ends[5]>=biggest14575){
            biggest14575=ends[5];
          }
          if(ends[6]>=biggest14575){
            biggest14575=ends[6];
          }
          if(biggest14575 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 17, column: 2
          thread14576(tdone,ends);
          thread14577(tdone,ends);
          thread14578(tdone,ends);
          thread14579(tdone,ends);
          thread14580(tdone,ends);
          int biggest14585 = 0;
          if(ends[2]>=biggest14585){
            biggest14585=ends[2];
          }
          if(ends[3]>=biggest14585){
            biggest14585=ends[3];
          }
          if(ends[4]>=biggest14585){
            biggest14585=ends[4];
          }
          if(ends[5]>=biggest14585){
            biggest14585=ends[5];
          }
          if(ends[6]>=biggest14585){
            biggest14585=ends[6];
          }
          if(biggest14585 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest14585 == 0){
            S14564=0;
            active[1]=0;
            ends[1]=0;
            S14564=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAtL_1 = new Signal();
    bottleAt5_1 = new Signal();
    motorOn_1 = new Signal();
    motorOff_1 = new Signal();
    empty_1 = new Signal();
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
          motConveyorOnOff.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtLoadE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAtL_1.setpreclear();
      bottleAt5_1.setpreclear();
      motorOn_1.setpreclear();
      motorOff_1.setpreclear();
      empty_1.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      bottleAtLoad.sethook();
      bottleAtLoad.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtLoadE.sethook();
      bottleAtLoadE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAtL_1.setClear();
      bottleAt5_1.setClear();
      motorOn_1.setClear();
      motorOff_1.setClear();
      empty_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
