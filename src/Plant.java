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
  private int S11335 = 1;
  private int S10063 = 1;
  private int S10017 = 1;
  private int S10116 = 1;
  private int S10070 = 1;
  private int S10160 = 1;
  private int S10130 = 1;
  private int S10125 = 1;
  private int S10228 = 1;
  private int S10182 = 1;
  private int S10164 = 1;
  private int S10290 = 1;
  private int S10340 = 1;
  private int S10298 = 1;
  private int S10306 = 1;
  private int S10314 = 1;
  private int S10322 = 1;
  private int S10330 = 1;
  private int S10338 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread11362(int [] tdone, int [] ends){
        switch(S10338){
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

  public void thread11361(int [] tdone, int [] ends){
        switch(S10330){
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

  public void thread11360(int [] tdone, int [] ends){
        switch(S10322){
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

  public void thread11359(int [] tdone, int [] ends){
        switch(S10314){
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

  public void thread11358(int [] tdone, int [] ends){
        switch(S10306){
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

  public void thread11357(int [] tdone, int [] ends){
        switch(S10298){
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

  public void thread11356(int [] tdone, int [] ends){
        switch(S10340){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread11357(tdone,ends);
        thread11358(tdone,ends);
        thread11359(tdone,ends);
        thread11360(tdone,ends);
        thread11361(tdone,ends);
        thread11362(tdone,ends);
        int biggest11363 = 0;
        if(ends[8]>=biggest11363){
          biggest11363=ends[8];
        }
        if(ends[9]>=biggest11363){
          biggest11363=ends[9];
        }
        if(ends[10]>=biggest11363){
          biggest11363=ends[10];
        }
        if(ends[11]>=biggest11363){
          biggest11363=ends[11];
        }
        if(ends[12]>=biggest11363){
          biggest11363=ends[12];
        }
        if(ends[13]>=biggest11363){
          biggest11363=ends[13];
        }
        if(biggest11363 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest11363 == 0){
          S10340=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread11355(int [] tdone, int [] ends){
        switch(S10290){
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

  public void thread11354(int [] tdone, int [] ends){
        switch(S10228){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10182){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 70, column: 10
              S10182=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S10164){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 72, column: 13
                    S10164=1;
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
                    S10164=2;
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
                    S10164=0;
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
              S10182=0;
              S10164=0;
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

  public void thread11353(int [] tdone, int [] ends){
        switch(S10160){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S10130){
          case 0 : 
            switch(S10125){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 50, column: 12
                  S10125=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 54, column: 7
                    S10130=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S10130=1;
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
                S10130=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
                    S10125=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S10130=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S10130=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S10130=1;
            S10130=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
                S10125=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S10130=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S10130=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11352(int [] tdone, int [] ends){
        switch(S10116){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S10070){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S10070=1;
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
              S10070=2;
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
              S10070=3;
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
              S10070=0;
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

  public void thread11351(int [] tdone, int [] ends){
        switch(S10063){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10017){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S10017=1;
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
              S10017=2;
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
              S10017=3;
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
              S10017=0;
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

  public void thread11348(int [] tdone, int [] ends){
        S10338=1;
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

  public void thread11347(int [] tdone, int [] ends){
        S10330=1;
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

  public void thread11346(int [] tdone, int [] ends){
        S10322=1;
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

  public void thread11345(int [] tdone, int [] ends){
        S10314=1;
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

  public void thread11344(int [] tdone, int [] ends){
        S10306=1;
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

  public void thread11343(int [] tdone, int [] ends){
        S10298=1;
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

  public void thread11342(int [] tdone, int [] ends){
        S10340=1;
    thread11343(tdone,ends);
    thread11344(tdone,ends);
    thread11345(tdone,ends);
    thread11346(tdone,ends);
    thread11347(tdone,ends);
    thread11348(tdone,ends);
    int biggest11349 = 0;
    if(ends[8]>=biggest11349){
      biggest11349=ends[8];
    }
    if(ends[9]>=biggest11349){
      biggest11349=ends[9];
    }
    if(ends[10]>=biggest11349){
      biggest11349=ends[10];
    }
    if(ends[11]>=biggest11349){
      biggest11349=ends[11];
    }
    if(ends[12]>=biggest11349){
      biggest11349=ends[12];
    }
    if(ends[13]>=biggest11349){
      biggest11349=ends[13];
    }
    if(biggest11349 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread11341(int [] tdone, int [] ends){
        S10290=1;
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

  public void thread11340(int [] tdone, int [] ends){
        S10228=1;
    S10182=0;
    S10164=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread11339(int [] tdone, int [] ends){
        S10160=1;
    S10130=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 49, column: 6
        S10125=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S10130=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S10130=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread11338(int [] tdone, int [] ends){
        S10116=1;
    S10070=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11337(int [] tdone, int [] ends){
        S10063=1;
    S10017=0;
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
      switch(S11335){
        case 0 : 
          S11335=0;
          break RUN;
        
        case 1 : 
          S11335=2;
          S11335=2;
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
          thread11337(tdone,ends);
          thread11338(tdone,ends);
          thread11339(tdone,ends);
          thread11340(tdone,ends);
          thread11341(tdone,ends);
          thread11342(tdone,ends);
          int biggest11350 = 0;
          if(ends[2]>=biggest11350){
            biggest11350=ends[2];
          }
          if(ends[3]>=biggest11350){
            biggest11350=ends[3];
          }
          if(ends[4]>=biggest11350){
            biggest11350=ends[4];
          }
          if(ends[5]>=biggest11350){
            biggest11350=ends[5];
          }
          if(ends[6]>=biggest11350){
            biggest11350=ends[6];
          }
          if(ends[7]>=biggest11350){
            biggest11350=ends[7];
          }
          if(biggest11350 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 17, column: 2
          thread11351(tdone,ends);
          thread11352(tdone,ends);
          thread11353(tdone,ends);
          thread11354(tdone,ends);
          thread11355(tdone,ends);
          thread11356(tdone,ends);
          int biggest11364 = 0;
          if(ends[2]>=biggest11364){
            biggest11364=ends[2];
          }
          if(ends[3]>=biggest11364){
            biggest11364=ends[3];
          }
          if(ends[4]>=biggest11364){
            biggest11364=ends[4];
          }
          if(ends[5]>=biggest11364){
            biggest11364=ends[5];
          }
          if(ends[6]>=biggest11364){
            biggest11364=ends[6];
          }
          if(ends[7]>=biggest11364){
            biggest11364=ends[7];
          }
          if(biggest11364 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest11364 == 0){
            S11335=0;
            active[1]=0;
            ends[1]=0;
            S11335=0;
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
