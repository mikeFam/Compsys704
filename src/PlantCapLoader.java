import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantCapLoader extends ClockDomain{
  public PlantCapLoader(String name){super(name);}
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
  private int capcount_thread_6;//sysj\plantCapLoader.sysj line: 85, column: 3
  private int S6061 = 1;
  private int S4789 = 1;
  private int S4743 = 1;
  private int S4842 = 1;
  private int S4796 = 1;
  private int S4886 = 1;
  private int S4856 = 1;
  private int S4851 = 1;
  private int S4954 = 1;
  private int S4908 = 1;
  private int S4890 = 1;
  private int S5016 = 1;
  private int S5066 = 1;
  private int S5024 = 1;
  private int S5032 = 1;
  private int S5040 = 1;
  private int S5048 = 1;
  private int S5056 = 1;
  private int S5064 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread6088(int [] tdone, int [] ends){
        switch(S5064){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 113, column: 24
          emptyE.setPresent();//sysj\plantCapLoader.sysj line: 113, column: 31
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

  public void thread6087(int [] tdone, int [] ends){
        switch(S5056){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plantCapLoader.sysj line: 111, column: 24
          armAtDestE.setPresent();//sysj\plantCapLoader.sysj line: 111, column: 35
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

  public void thread6086(int [] tdone, int [] ends){
        switch(S5048){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 109, column: 24
          armAtSourceE.setPresent();//sysj\plantCapLoader.sysj line: 109, column: 37
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

  public void thread6085(int [] tdone, int [] ends){
        switch(S5040){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plantCapLoader.sysj line: 107, column: 24
          WPgrippedE.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 35
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

  public void thread6084(int [] tdone, int [] ends){
        switch(S5032){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 105, column: 24
          pusherExtendedE.setPresent();//sysj\plantCapLoader.sysj line: 105, column: 40
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

  public void thread6083(int [] tdone, int [] ends){
        switch(S5024){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 103, column: 24
          pusherRetractedE.setPresent();//sysj\plantCapLoader.sysj line: 103, column: 41
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

  public void thread6082(int [] tdone, int [] ends){
        switch(S5066){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread6083(tdone,ends);
        thread6084(tdone,ends);
        thread6085(tdone,ends);
        thread6086(tdone,ends);
        thread6087(tdone,ends);
        thread6088(tdone,ends);
        int biggest6089 = 0;
        if(ends[8]>=biggest6089){
          biggest6089=ends[8];
        }
        if(ends[9]>=biggest6089){
          biggest6089=ends[9];
        }
        if(ends[10]>=biggest6089){
          biggest6089=ends[10];
        }
        if(ends[11]>=biggest6089){
          biggest6089=ends[11];
        }
        if(ends[12]>=biggest6089){
          biggest6089=ends[12];
        }
        if(ends[13]>=biggest6089){
          biggest6089=ends[13];
        }
        if(biggest6089 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest6089 == 0){
          S5066=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread6081(int [] tdone, int [] ends){
        switch(S5016){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plantCapLoader.sysj line: 87, column: 12
          if(capcount_thread_6 > 0) {//sysj\plantCapLoader.sysj line: 88, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\plantCapLoader.sysj line: 89, column: 6
          }
          if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\plantCapLoader.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
            if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
          if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\plantCapLoader.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
            if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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

  public void thread6080(int [] tdone, int [] ends){
        switch(S4954){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S4908){
          case 0 : 
            if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 70, column: 10
              S4908=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S4890){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 72, column: 13
                    S4890=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 73, column: 13
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 75, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 75, column: 7
                    S4890=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 76, column: 13
                    capDec_1.setPresent();//sysj\plantCapLoader.sysj line: 77, column: 7
                    currsigs.addElement(capDec_1);
                    S4890=0;
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
            if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 80, column: 10
              S4908=0;
              S4890=0;
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

  public void thread6079(int [] tdone, int [] ends){
        switch(S4886){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S4856){
          case 0 : 
            switch(S4851){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plantCapLoader.sysj line: 50, column: 12
                  S4851=1;
                  if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 54, column: 7
                    S4856=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S4856=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S4856=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                    S4851=0;
                    WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S4856=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S4856=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4856=1;
            S4856=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                S4851=0;
                WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S4856=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S4856=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6078(int [] tdone, int [] ends){
        switch(S4842){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4796){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 34, column: 10
              S4796=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 35, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 37, column: 10
              S4796=2;
              pusherExtended.setPresent();//sysj\plantCapLoader.sysj line: 39, column: 5
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 38, column: 10
              S4796=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plantCapLoader.sysj line: 39, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 41, column: 10
              S4796=0;
              pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 35, column: 5
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

  public void thread6077(int [] tdone, int [] ends){
        switch(S4789){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4743){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 21, column: 10
              S4743=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 22, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 24, column: 10
              S4743=2;
              armAtSource.setPresent();//sysj\plantCapLoader.sysj line: 26, column: 5
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 25, column: 10
              S4743=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plantCapLoader.sysj line: 26, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 28, column: 10
              S4743=0;
              armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 22, column: 5
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

  public void thread6074(int [] tdone, int [] ends){
        S5064=1;
    if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 113, column: 24
      emptyE.setPresent();//sysj\plantCapLoader.sysj line: 113, column: 31
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

  public void thread6073(int [] tdone, int [] ends){
        S5056=1;
    if(armAtDest.getprestatus()){//sysj\plantCapLoader.sysj line: 111, column: 24
      armAtDestE.setPresent();//sysj\plantCapLoader.sysj line: 111, column: 35
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

  public void thread6072(int [] tdone, int [] ends){
        S5048=1;
    if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 109, column: 24
      armAtSourceE.setPresent();//sysj\plantCapLoader.sysj line: 109, column: 37
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

  public void thread6071(int [] tdone, int [] ends){
        S5040=1;
    if(WPgripped.getprestatus()){//sysj\plantCapLoader.sysj line: 107, column: 24
      WPgrippedE.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 35
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

  public void thread6070(int [] tdone, int [] ends){
        S5032=1;
    if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 105, column: 24
      pusherExtendedE.setPresent();//sysj\plantCapLoader.sysj line: 105, column: 40
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

  public void thread6069(int [] tdone, int [] ends){
        S5024=1;
    if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 103, column: 24
      pusherRetractedE.setPresent();//sysj\plantCapLoader.sysj line: 103, column: 41
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

  public void thread6068(int [] tdone, int [] ends){
        S5066=1;
    thread6069(tdone,ends);
    thread6070(tdone,ends);
    thread6071(tdone,ends);
    thread6072(tdone,ends);
    thread6073(tdone,ends);
    thread6074(tdone,ends);
    int biggest6075 = 0;
    if(ends[8]>=biggest6075){
      biggest6075=ends[8];
    }
    if(ends[9]>=biggest6075){
      biggest6075=ends[9];
    }
    if(ends[10]>=biggest6075){
      biggest6075=ends[10];
    }
    if(ends[11]>=biggest6075){
      biggest6075=ends[11];
    }
    if(ends[12]>=biggest6075){
      biggest6075=ends[12];
    }
    if(ends[13]>=biggest6075){
      biggest6075=ends[13];
    }
    if(biggest6075 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread6067(int [] tdone, int [] ends){
        S5016=1;
    capcount_thread_6 = 5;//sysj\plantCapLoader.sysj line: 85, column: 3
    if(capDec_1.getprestatus()){//sysj\plantCapLoader.sysj line: 87, column: 12
      if(capcount_thread_6 > 0) {//sysj\plantCapLoader.sysj line: 88, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\plantCapLoader.sysj line: 89, column: 6
      }
      if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\plantCapLoader.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
        if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
      if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\plantCapLoader.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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
        if(capcount_thread_6 == 0){//sysj\plantCapLoader.sysj line: 95, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 96, column: 6
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

  public void thread6066(int [] tdone, int [] ends){
        S4954=1;
    S4908=0;
    S4890=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6065(int [] tdone, int [] ends){
        S4886=1;
    S4856=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
        S4851=0;
        WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S4856=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S4856=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread6064(int [] tdone, int [] ends){
        S4842=1;
    S4796=0;
    pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6063(int [] tdone, int [] ends){
        S4789=1;
    S4743=0;
    armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 22, column: 5
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
      switch(S6061){
        case 0 : 
          S6061=0;
          break RUN;
        
        case 1 : 
          S6061=2;
          S6061=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapLoader.sysj line: 8, column: 1
            public void run() {//sysj\plantCapLoader.sysj line: 10, column: 21
              org.compsys704.CapLoader.main(null);//sysj\plantCapLoader.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantCapLoader.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapLoader.sysj line: 14, column: 2
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 18, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 18, column: 2
          thread6063(tdone,ends);
          thread6064(tdone,ends);
          thread6065(tdone,ends);
          thread6066(tdone,ends);
          thread6067(tdone,ends);
          thread6068(tdone,ends);
          int biggest6076 = 0;
          if(ends[2]>=biggest6076){
            biggest6076=ends[2];
          }
          if(ends[3]>=biggest6076){
            biggest6076=ends[3];
          }
          if(ends[4]>=biggest6076){
            biggest6076=ends[4];
          }
          if(ends[5]>=biggest6076){
            biggest6076=ends[5];
          }
          if(ends[6]>=biggest6076){
            biggest6076=ends[6];
          }
          if(ends[7]>=biggest6076){
            biggest6076=ends[7];
          }
          if(biggest6076 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          thread6077(tdone,ends);
          thread6078(tdone,ends);
          thread6079(tdone,ends);
          thread6080(tdone,ends);
          thread6081(tdone,ends);
          thread6082(tdone,ends);
          int biggest6090 = 0;
          if(ends[2]>=biggest6090){
            biggest6090=ends[2];
          }
          if(ends[3]>=biggest6090){
            biggest6090=ends[3];
          }
          if(ends[4]>=biggest6090){
            biggest6090=ends[4];
          }
          if(ends[5]>=biggest6090){
            biggest6090=ends[5];
          }
          if(ends[6]>=biggest6090){
            biggest6090=ends[6];
          }
          if(ends[7]>=biggest6090){
            biggest6090=ends[7];
          }
          if(biggest6090 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6090 == 0){
            S6061=0;
            active[1]=0;
            ends[1]=0;
            S6061=0;
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
