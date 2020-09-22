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
  public Signal enableCapLoader = new Signal("enableCapLoader", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_7;//sysj\plantCapLoader.sysj line: 96, column: 3
  private int S12388 = 1;
  private int S10820 = 1;
  private int S10774 = 1;
  private int S10894 = 1;
  private int S10838 = 1;
  private int S10947 = 1;
  private int S10901 = 1;
  private int S10991 = 1;
  private int S10961 = 1;
  private int S10956 = 1;
  private int S11059 = 1;
  private int S11013 = 1;
  private int S10995 = 1;
  private int S11121 = 1;
  private int S11171 = 1;
  private int S11129 = 1;
  private int S11137 = 1;
  private int S11145 = 1;
  private int S11153 = 1;
  private int S11161 = 1;
  private int S11169 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread12417(int [] tdone, int [] ends){
        switch(S11169){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 124, column: 24
          emptyE.setPresent();//sysj\plantCapLoader.sysj line: 124, column: 31
          currsigs.addElement(emptyE);
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

  public void thread12416(int [] tdone, int [] ends){
        switch(S11161){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plantCapLoader.sysj line: 122, column: 24
          armAtDestE.setPresent();//sysj\plantCapLoader.sysj line: 122, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread12415(int [] tdone, int [] ends){
        switch(S11153){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 120, column: 24
          armAtSourceE.setPresent();//sysj\plantCapLoader.sysj line: 120, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread12414(int [] tdone, int [] ends){
        switch(S11145){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plantCapLoader.sysj line: 118, column: 24
          WPgrippedE.setPresent();//sysj\plantCapLoader.sysj line: 118, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread12413(int [] tdone, int [] ends){
        switch(S11137){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 116, column: 24
          pusherExtendedE.setPresent();//sysj\plantCapLoader.sysj line: 116, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread12412(int [] tdone, int [] ends){
        switch(S11129){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 114, column: 24
          pusherRetractedE.setPresent();//sysj\plantCapLoader.sysj line: 114, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread12411(int [] tdone, int [] ends){
        switch(S11171){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread12412(tdone,ends);
        thread12413(tdone,ends);
        thread12414(tdone,ends);
        thread12415(tdone,ends);
        thread12416(tdone,ends);
        thread12417(tdone,ends);
        int biggest12418 = 0;
        if(ends[9]>=biggest12418){
          biggest12418=ends[9];
        }
        if(ends[10]>=biggest12418){
          biggest12418=ends[10];
        }
        if(ends[11]>=biggest12418){
          biggest12418=ends[11];
        }
        if(ends[12]>=biggest12418){
          biggest12418=ends[12];
        }
        if(ends[13]>=biggest12418){
          biggest12418=ends[13];
        }
        if(ends[14]>=biggest12418){
          biggest12418=ends[14];
        }
        if(biggest12418 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest12418 == 0){
          S11171=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread12410(int [] tdone, int [] ends){
        switch(S11121){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plantCapLoader.sysj line: 98, column: 12
          if(capcount_thread_7 > 0) {//sysj\plantCapLoader.sysj line: 99, column: 5
            capcount_thread_7 = capcount_thread_7 - 1;//sysj\plantCapLoader.sysj line: 100, column: 6
          }
          if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 102, column: 12
            capcount_thread_7 = 5;//sysj\plantCapLoader.sysj line: 103, column: 5
            if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 102, column: 12
            capcount_thread_7 = 5;//sysj\plantCapLoader.sysj line: 103, column: 5
            if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
              empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread12409(int [] tdone, int [] ends){
        switch(S11059){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S11013){
          case 0 : 
            if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 81, column: 10
              S11013=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S10995){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 83, column: 13
                    S10995=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 84, column: 13
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 86, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 86, column: 7
                    S10995=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 87, column: 13
                    capDec_1.setPresent();//sysj\plantCapLoader.sysj line: 88, column: 7
                    currsigs.addElement(capDec_1);
                    S10995=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 91, column: 10
              S11013=0;
              S10995=0;
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
        break;
      
    }
  }

  public void thread12408(int [] tdone, int [] ends){
        switch(S10991){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10961){
          case 0 : 
            switch(S10956){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plantCapLoader.sysj line: 61, column: 12
                  S10956=1;
                  if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 64, column: 14
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 65, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 65, column: 7
                    S10961=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S10961=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 62, column: 7
                  currsigs.addElement(WPgripped);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
              case 1 : 
                S10961=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 58, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 59, column: 8
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 60, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 60, column: 6
                    S10956=0;
                    WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 62, column: 7
                    currsigs.addElement(WPgripped);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S10961=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  S10961=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S10961=1;
            S10961=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 58, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 59, column: 8
                capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 60, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 60, column: 6
                S10956=0;
                WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 62, column: 7
                currsigs.addElement(WPgripped);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S10961=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S10961=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12407(int [] tdone, int [] ends){
        switch(S10947){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S10901){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 45, column: 10
              S10901=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 46, column: 5
              currsigs.addElement(pusherRetracted);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 48, column: 10
              S10901=2;
              pusherExtended.setPresent();//sysj\plantCapLoader.sysj line: 50, column: 5
              currsigs.addElement(pusherExtended);
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 49, column: 10
              S10901=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plantCapLoader.sysj line: 50, column: 5
              currsigs.addElement(pusherExtended);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 52, column: 10
              S10901=0;
              pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 46, column: 5
              currsigs.addElement(pusherRetracted);
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

  public void thread12406(int [] tdone, int [] ends){
        switch(S10894){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S10838){
          case 0 : 
            if(enableCapLoader.getprestatus()){//sysj\plantCapLoader.sysj line: 35, column: 11
              S10838=1;
              if((!enableCapLoader.getprestatus())){//sysj\plantCapLoader.sysj line: 36, column: 21
                S10838=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                System.out.println("enableCapLoader");//sysj\plantCapLoader.sysj line: 37, column: 5
                bottleAtPos3.setPresent();//sysj\plantCapLoader.sysj line: 38, column: 5
                currsigs.addElement(bottleAtPos3);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if((!enableCapLoader.getprestatus())){//sysj\plantCapLoader.sysj line: 36, column: 21
              S10838=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\plantCapLoader.sysj line: 38, column: 5
              currsigs.addElement(bottleAtPos3);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12405(int [] tdone, int [] ends){
        switch(S10820){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10774){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 22, column: 10
              S10774=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 23, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 25, column: 10
              S10774=2;
              armAtSource.setPresent();//sysj\plantCapLoader.sysj line: 27, column: 5
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 26, column: 10
              S10774=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plantCapLoader.sysj line: 27, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapLoader.sysj line: 29, column: 10
              S10774=0;
              armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 23, column: 5
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

  public void thread12402(int [] tdone, int [] ends){
        S11169=1;
    if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 124, column: 24
      emptyE.setPresent();//sysj\plantCapLoader.sysj line: 124, column: 31
      currsigs.addElement(emptyE);
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

  public void thread12401(int [] tdone, int [] ends){
        S11161=1;
    if(armAtDest.getprestatus()){//sysj\plantCapLoader.sysj line: 122, column: 24
      armAtDestE.setPresent();//sysj\plantCapLoader.sysj line: 122, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread12400(int [] tdone, int [] ends){
        S11153=1;
    if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 120, column: 24
      armAtSourceE.setPresent();//sysj\plantCapLoader.sysj line: 120, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread12399(int [] tdone, int [] ends){
        S11145=1;
    if(WPgripped.getprestatus()){//sysj\plantCapLoader.sysj line: 118, column: 24
      WPgrippedE.setPresent();//sysj\plantCapLoader.sysj line: 118, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread12398(int [] tdone, int [] ends){
        S11137=1;
    if(pusherExtended.getprestatus()){//sysj\plantCapLoader.sysj line: 116, column: 24
      pusherExtendedE.setPresent();//sysj\plantCapLoader.sysj line: 116, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread12397(int [] tdone, int [] ends){
        S11129=1;
    if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 114, column: 24
      pusherRetractedE.setPresent();//sysj\plantCapLoader.sysj line: 114, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread12396(int [] tdone, int [] ends){
        S11171=1;
    thread12397(tdone,ends);
    thread12398(tdone,ends);
    thread12399(tdone,ends);
    thread12400(tdone,ends);
    thread12401(tdone,ends);
    thread12402(tdone,ends);
    int biggest12403 = 0;
    if(ends[9]>=biggest12403){
      biggest12403=ends[9];
    }
    if(ends[10]>=biggest12403){
      biggest12403=ends[10];
    }
    if(ends[11]>=biggest12403){
      biggest12403=ends[11];
    }
    if(ends[12]>=biggest12403){
      biggest12403=ends[12];
    }
    if(ends[13]>=biggest12403){
      biggest12403=ends[13];
    }
    if(ends[14]>=biggest12403){
      biggest12403=ends[14];
    }
    if(biggest12403 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread12395(int [] tdone, int [] ends){
        S11121=1;
    capcount_thread_7 = 5;//sysj\plantCapLoader.sysj line: 96, column: 3
    if(capDec_1.getprestatus()){//sysj\plantCapLoader.sysj line: 98, column: 12
      if(capcount_thread_7 > 0) {//sysj\plantCapLoader.sysj line: 99, column: 5
        capcount_thread_7 = capcount_thread_7 - 1;//sysj\plantCapLoader.sysj line: 100, column: 6
      }
      if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 102, column: 12
        capcount_thread_7 = 5;//sysj\plantCapLoader.sysj line: 103, column: 5
        if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\plantCapLoader.sysj line: 102, column: 12
        capcount_thread_7 = 5;//sysj\plantCapLoader.sysj line: 103, column: 5
        if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_7 == 0){//sysj\plantCapLoader.sysj line: 106, column: 8
          empty.setPresent();//sysj\plantCapLoader.sysj line: 107, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread12394(int [] tdone, int [] ends){
        S11059=1;
    S11013=0;
    S10995=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread12393(int [] tdone, int [] ends){
        S10991=1;
    S10961=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 58, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 59, column: 8
        capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 60, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 60, column: 6
        S10956=0;
        WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 62, column: 7
        currsigs.addElement(WPgripped);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S10961=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S10961=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread12392(int [] tdone, int [] ends){
        S10947=1;
    S10901=0;
    pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 46, column: 5
    currsigs.addElement(pusherRetracted);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread12391(int [] tdone, int [] ends){
        S10894=1;
    S10838=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread12390(int [] tdone, int [] ends){
        S10820=1;
    S10774=0;
    armAtDest.setPresent();//sysj\plantCapLoader.sysj line: 23, column: 5
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
      switch(S12388){
        case 0 : 
          S12388=0;
          break RUN;
        
        case 1 : 
          S12388=2;
          S12388=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapLoader.sysj line: 9, column: 1
            public void run() {//sysj\plantCapLoader.sysj line: 11, column: 21
              org.compsys704.CapLoader.main(null);//sysj\plantCapLoader.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantCapLoader.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapLoader.sysj line: 15, column: 2
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 18, column: 2
          capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 19, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 19, column: 2
          thread12390(tdone,ends);
          thread12391(tdone,ends);
          thread12392(tdone,ends);
          thread12393(tdone,ends);
          thread12394(tdone,ends);
          thread12395(tdone,ends);
          thread12396(tdone,ends);
          int biggest12404 = 0;
          if(ends[2]>=biggest12404){
            biggest12404=ends[2];
          }
          if(ends[3]>=biggest12404){
            biggest12404=ends[3];
          }
          if(ends[4]>=biggest12404){
            biggest12404=ends[4];
          }
          if(ends[5]>=biggest12404){
            biggest12404=ends[5];
          }
          if(ends[6]>=biggest12404){
            biggest12404=ends[6];
          }
          if(ends[7]>=biggest12404){
            biggest12404=ends[7];
          }
          if(ends[8]>=biggest12404){
            biggest12404=ends[8];
          }
          if(biggest12404 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 18, column: 2
          thread12405(tdone,ends);
          thread12406(tdone,ends);
          thread12407(tdone,ends);
          thread12408(tdone,ends);
          thread12409(tdone,ends);
          thread12410(tdone,ends);
          thread12411(tdone,ends);
          int biggest12419 = 0;
          if(ends[2]>=biggest12419){
            biggest12419=ends[2];
          }
          if(ends[3]>=biggest12419){
            biggest12419=ends[3];
          }
          if(ends[4]>=biggest12419){
            biggest12419=ends[4];
          }
          if(ends[5]>=biggest12419){
            biggest12419=ends[5];
          }
          if(ends[6]>=biggest12419){
            biggest12419=ends[6];
          }
          if(ends[7]>=biggest12419){
            biggest12419=ends[7];
          }
          if(ends[8]>=biggest12419){
            biggest12419=ends[8];
          }
          if(biggest12419 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12419 == 0){
            S12388=0;
            active[1]=0;
            ends[1]=0;
            S12388=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          enableCapLoader.gethook();
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
      enableCapLoader.setpreclear();
      bottleAtPos3.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      bottleAtPos3E.setpreclear();
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
      dummyint = enableCapLoader.getStatus() ? enableCapLoader.setprepresent() : enableCapLoader.setpreclear();
      enableCapLoader.setpreval(enableCapLoader.getValue());
      enableCapLoader.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
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
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
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
        enableCapLoader.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
