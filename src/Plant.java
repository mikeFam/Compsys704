import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\plant.sysj line: 85, column: 3
  private int S10735 = 1;
  private int S9463 = 1;
  private int S9417 = 1;
  private int S9516 = 1;
  private int S9470 = 1;
  private int S9560 = 1;
  private int S9530 = 1;
  private int S9525 = 1;
  private int S9628 = 1;
  private int S9582 = 1;
  private int S9564 = 1;
  private int S9690 = 1;
  private int S9740 = 1;
  private int S9698 = 1;
  private int S9706 = 1;
  private int S9714 = 1;
  private int S9722 = 1;
  private int S9730 = 1;
  private int S9738 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread10762(int [] tdone, int [] ends){
        switch(S9738){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 113, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 113, column: 31
          currsigs.addElement(emptyE);
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

  public void thread10761(int [] tdone, int [] ends){
        switch(S9730){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 111, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 111, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread10760(int [] tdone, int [] ends){
        switch(S9722){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 109, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 109, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread10759(int [] tdone, int [] ends){
        switch(S9714){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 107, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 107, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread10758(int [] tdone, int [] ends){
        switch(S9706){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 105, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 105, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread10757(int [] tdone, int [] ends){
        switch(S9698){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 103, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 103, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread10756(int [] tdone, int [] ends){
        switch(S9740){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread10757(tdone,ends);
        thread10758(tdone,ends);
        thread10759(tdone,ends);
        thread10760(tdone,ends);
        thread10761(tdone,ends);
        thread10762(tdone,ends);
        int biggest10763 = 0;
        if(ends[8]>=biggest10763){
          biggest10763=ends[8];
        }
        if(ends[9]>=biggest10763){
          biggest10763=ends[9];
        }
        if(ends[10]>=biggest10763){
          biggest10763=ends[10];
        }
        if(ends[11]>=biggest10763){
          biggest10763=ends[11];
        }
        if(ends[12]>=biggest10763){
          biggest10763=ends[12];
        }
        if(ends[13]>=biggest10763){
          biggest10763=ends[13];
        }
        if(biggest10763 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest10763 == 0){
          S9740=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread10755(int [] tdone, int [] ends){
        switch(S9690){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 87, column: 12
          if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 88, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 89, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\plant.sysj line: 96, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\plant.sysj line: 96, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\plant.sysj line: 96, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\plant.sysj line: 96, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread10754(int [] tdone, int [] ends){
        switch(S9628){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S9582){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 70, column: 10
              S9582=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S9564){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 72, column: 13
                    S9564=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 73, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 75, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 75, column: 7
                    S9564=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 76, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 77, column: 7
                    currsigs.addElement(capDec_1);
                    S9564=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 80, column: 10
              S9582=0;
              S9564=0;
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

  public void thread10753(int [] tdone, int [] ends){
        switch(S9560){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S9530){
          case 0 : 
            switch(S9525){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 50, column: 12
                  S9525=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 54, column: 7
                    S9530=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S9530=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S9530=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
                    S9525=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S9530=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S9530=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S9530=1;
            S9530=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
                S9525=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S9530=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S9530=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10752(int [] tdone, int [] ends){
        switch(S9516){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S9470){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S9470=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 37, column: 10
              S9470=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(pusherExtended);
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S9470=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 41, column: 10
              S9470=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(pusherRetracted);
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

  public void thread10751(int [] tdone, int [] ends){
        switch(S9463){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9417){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S9417=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 22, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S9417=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S9417=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 28, column: 10
              S9417=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 22, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
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

  public void thread10748(int [] tdone, int [] ends){
        S9738=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 113, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 113, column: 31
      currsigs.addElement(emptyE);
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

  public void thread10747(int [] tdone, int [] ends){
        S9730=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 111, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 111, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread10746(int [] tdone, int [] ends){
        S9722=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 109, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 109, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread10745(int [] tdone, int [] ends){
        S9714=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 107, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 107, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread10744(int [] tdone, int [] ends){
        S9706=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 105, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 105, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread10743(int [] tdone, int [] ends){
        S9698=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 103, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 103, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread10742(int [] tdone, int [] ends){
        S9740=1;
    thread10743(tdone,ends);
    thread10744(tdone,ends);
    thread10745(tdone,ends);
    thread10746(tdone,ends);
    thread10747(tdone,ends);
    thread10748(tdone,ends);
    int biggest10749 = 0;
    if(ends[8]>=biggest10749){
      biggest10749=ends[8];
    }
    if(ends[9]>=biggest10749){
      biggest10749=ends[9];
    }
    if(ends[10]>=biggest10749){
      biggest10749=ends[10];
    }
    if(ends[11]>=biggest10749){
      biggest10749=ends[11];
    }
    if(ends[12]>=biggest10749){
      biggest10749=ends[12];
    }
    if(ends[13]>=biggest10749){
      biggest10749=ends[13];
    }
    if(biggest10749 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread10741(int [] tdone, int [] ends){
        S9690=1;
    capcount_thread_6 = 5;//sysj\plant.sysj line: 85, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 87, column: 12
      if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 88, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 89, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\plant.sysj line: 96, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\plant.sysj line: 96, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\plant.sysj line: 96, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\plant.sysj line: 96, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread10740(int [] tdone, int [] ends){
        S9628=1;
    S9582=0;
    S9564=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread10739(int [] tdone, int [] ends){
        S9560=1;
    S9530=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
        S9525=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S9530=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S9530=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread10738(int [] tdone, int [] ends){
        S9516=1;
    S9470=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10737(int [] tdone, int [] ends){
        S9463=1;
    S9417=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 22, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S10735){
        case 0 : 
          S10735=0;
          break RUN;
        
        case 1 : 
          S10735=2;
          S10735=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plant.sysj line: 8, column: 1
            public void run() {//sysj\plant.sysj line: 10, column: 21
              org.compsys704.CapLoader.main(null);//sysj\plant.sysj line: 11, column: 4
            }
            GUI(){//sysj\plant.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plant.sysj line: 14, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 17, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 18, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 18, column: 2
          thread10737(tdone,ends);
          thread10738(tdone,ends);
          thread10739(tdone,ends);
          thread10740(tdone,ends);
          thread10741(tdone,ends);
          thread10742(tdone,ends);
          int biggest10750 = 0;
          if(ends[2]>=biggest10750){
            biggest10750=ends[2];
          }
          if(ends[3]>=biggest10750){
            biggest10750=ends[3];
          }
          if(ends[4]>=biggest10750){
            biggest10750=ends[4];
          }
          if(ends[5]>=biggest10750){
            biggest10750=ends[5];
          }
          if(ends[6]>=biggest10750){
            biggest10750=ends[6];
          }
          if(ends[7]>=biggest10750){
            biggest10750=ends[7];
          }
          if(biggest10750 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 17, column: 2
          thread10751(tdone,ends);
          thread10752(tdone,ends);
          thread10753(tdone,ends);
          thread10754(tdone,ends);
          thread10755(tdone,ends);
          thread10756(tdone,ends);
          int biggest10764 = 0;
          if(ends[2]>=biggest10764){
            biggest10764=ends[2];
          }
          if(ends[3]>=biggest10764){
            biggest10764=ends[3];
          }
          if(ends[4]>=biggest10764){
            biggest10764=ends[4];
          }
          if(ends[5]>=biggest10764){
            biggest10764=ends[5];
          }
          if(ends[6]>=biggest10764){
            biggest10764=ends[6];
          }
          if(ends[7]>=biggest10764){
            biggest10764=ends[7];
          }
          if(biggest10764 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10764 == 0){
            S10735=0;
            active[1]=0;
            ends[1]=0;
            S10735=0;
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
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
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
