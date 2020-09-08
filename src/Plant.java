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
  private int capcount_thread_6;//sysj\plantCapLoader.sysj line: 85, column: 3
  private int S2295 = 1;
  private int S1023 = 1;
  private int S977 = 1;
  private int S1076 = 1;
  private int S1030 = 1;
  private int S1120 = 1;
  private int S1090 = 1;
  private int S1085 = 1;
  private int S1188 = 1;
  private int S1142 = 1;
  private int S1124 = 1;
  private int S1250 = 1;
  private int S1300 = 1;
  private int S1258 = 1;
  private int S1266 = 1;
  private int S1274 = 1;
  private int S1282 = 1;
  private int S1290 = 1;
  private int S1298 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread2322(int [] tdone, int [] ends){
        switch(S1298){
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

  public void thread2321(int [] tdone, int [] ends){
        switch(S1290){
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

  public void thread2320(int [] tdone, int [] ends){
        switch(S1282){
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

  public void thread2319(int [] tdone, int [] ends){
        switch(S1274){
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

  public void thread2318(int [] tdone, int [] ends){
        switch(S1266){
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

  public void thread2317(int [] tdone, int [] ends){
        switch(S1258){
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

  public void thread2316(int [] tdone, int [] ends){
        switch(S1300){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread2317(tdone,ends);
        thread2318(tdone,ends);
        thread2319(tdone,ends);
        thread2320(tdone,ends);
        thread2321(tdone,ends);
        thread2322(tdone,ends);
        int biggest2323 = 0;
        if(ends[8]>=biggest2323){
          biggest2323=ends[8];
        }
        if(ends[9]>=biggest2323){
          biggest2323=ends[9];
        }
        if(ends[10]>=biggest2323){
          biggest2323=ends[10];
        }
        if(ends[11]>=biggest2323){
          biggest2323=ends[11];
        }
        if(ends[12]>=biggest2323){
          biggest2323=ends[12];
        }
        if(ends[13]>=biggest2323){
          biggest2323=ends[13];
        }
        if(biggest2323 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest2323 == 0){
          S1300=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2315(int [] tdone, int [] ends){
        switch(S1250){
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

  public void thread2314(int [] tdone, int [] ends){
        switch(S1188){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1142){
          case 0 : 
            if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 70, column: 10
              S1142=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S1124){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 72, column: 13
                    S1124=1;
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
                    S1124=2;
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
                    S1124=0;
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
              S1142=0;
              S1124=0;
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

  public void thread2313(int [] tdone, int [] ends){
        switch(S1120){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1090){
          case 0 : 
            switch(S1085){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plantCapLoader.sysj line: 50, column: 12
                  S1085=1;
                  if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 54, column: 7
                    S1090=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S1090=1;
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
                S1090=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                    S1085=0;
                    WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S1090=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S1090=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1090=1;
            S1090=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                S1085=0;
                WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S1090=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S1090=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2312(int [] tdone, int [] ends){
        switch(S1076){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1030){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 34, column: 10
              S1030=1;
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
              S1030=2;
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
              S1030=3;
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
              S1030=0;
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

  public void thread2311(int [] tdone, int [] ends){
        switch(S1023){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S977){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 21, column: 10
              S977=1;
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
              S977=2;
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
              S977=3;
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
              S977=0;
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

  public void thread2308(int [] tdone, int [] ends){
        S1298=1;
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

  public void thread2307(int [] tdone, int [] ends){
        S1290=1;
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

  public void thread2306(int [] tdone, int [] ends){
        S1282=1;
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

  public void thread2305(int [] tdone, int [] ends){
        S1274=1;
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

  public void thread2304(int [] tdone, int [] ends){
        S1266=1;
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

  public void thread2303(int [] tdone, int [] ends){
        S1258=1;
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

  public void thread2302(int [] tdone, int [] ends){
        S1300=1;
    thread2303(tdone,ends);
    thread2304(tdone,ends);
    thread2305(tdone,ends);
    thread2306(tdone,ends);
    thread2307(tdone,ends);
    thread2308(tdone,ends);
    int biggest2309 = 0;
    if(ends[8]>=biggest2309){
      biggest2309=ends[8];
    }
    if(ends[9]>=biggest2309){
      biggest2309=ends[9];
    }
    if(ends[10]>=biggest2309){
      biggest2309=ends[10];
    }
    if(ends[11]>=biggest2309){
      biggest2309=ends[11];
    }
    if(ends[12]>=biggest2309){
      biggest2309=ends[12];
    }
    if(ends[13]>=biggest2309){
      biggest2309=ends[13];
    }
    if(biggest2309 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2301(int [] tdone, int [] ends){
        S1250=1;
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

  public void thread2300(int [] tdone, int [] ends){
        S1188=1;
    S1142=0;
    S1124=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2299(int [] tdone, int [] ends){
        S1120=1;
    S1090=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
        S1085=0;
        WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S1090=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S1090=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2298(int [] tdone, int [] ends){
        S1076=1;
    S1030=0;
    pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2297(int [] tdone, int [] ends){
        S1023=1;
    S977=0;
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
      switch(S2295){
        case 0 : 
          S2295=0;
          break RUN;
        
        case 1 : 
          S2295=2;
          S2295=2;
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
          thread2297(tdone,ends);
          thread2298(tdone,ends);
          thread2299(tdone,ends);
          thread2300(tdone,ends);
          thread2301(tdone,ends);
          thread2302(tdone,ends);
          int biggest2310 = 0;
          if(ends[2]>=biggest2310){
            biggest2310=ends[2];
          }
          if(ends[3]>=biggest2310){
            biggest2310=ends[3];
          }
          if(ends[4]>=biggest2310){
            biggest2310=ends[4];
          }
          if(ends[5]>=biggest2310){
            biggest2310=ends[5];
          }
          if(ends[6]>=biggest2310){
            biggest2310=ends[6];
          }
          if(ends[7]>=biggest2310){
            biggest2310=ends[7];
          }
          if(biggest2310 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          thread2311(tdone,ends);
          thread2312(tdone,ends);
          thread2313(tdone,ends);
          thread2314(tdone,ends);
          thread2315(tdone,ends);
          thread2316(tdone,ends);
          int biggest2324 = 0;
          if(ends[2]>=biggest2324){
            biggest2324=ends[2];
          }
          if(ends[3]>=biggest2324){
            biggest2324=ends[3];
          }
          if(ends[4]>=biggest2324){
            biggest2324=ends[4];
          }
          if(ends[5]>=biggest2324){
            biggest2324=ends[5];
          }
          if(ends[6]>=biggest2324){
            biggest2324=ends[6];
          }
          if(ends[7]>=biggest2324){
            biggest2324=ends[7];
          }
          if(biggest2324 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2324 == 0){
            S2295=0;
            active[1]=0;
            ends[1]=0;
            S2295=0;
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
