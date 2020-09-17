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
  private int S12458 = 1;
  private int S11186 = 1;
  private int S11140 = 1;
  private int S11239 = 1;
  private int S11193 = 1;
  private int S11283 = 1;
  private int S11253 = 1;
  private int S11248 = 1;
  private int S11351 = 1;
  private int S11305 = 1;
  private int S11287 = 1;
  private int S11413 = 1;
  private int S11463 = 1;
  private int S11421 = 1;
  private int S11429 = 1;
  private int S11437 = 1;
  private int S11445 = 1;
  private int S11453 = 1;
  private int S11461 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread12485(int [] tdone, int [] ends){
        switch(S11461){
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

  public void thread12484(int [] tdone, int [] ends){
        switch(S11453){
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

  public void thread12483(int [] tdone, int [] ends){
        switch(S11445){
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

  public void thread12482(int [] tdone, int [] ends){
        switch(S11437){
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

  public void thread12481(int [] tdone, int [] ends){
        switch(S11429){
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

  public void thread12480(int [] tdone, int [] ends){
        switch(S11421){
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

  public void thread12479(int [] tdone, int [] ends){
        switch(S11463){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread12480(tdone,ends);
        thread12481(tdone,ends);
        thread12482(tdone,ends);
        thread12483(tdone,ends);
        thread12484(tdone,ends);
        thread12485(tdone,ends);
        int biggest12486 = 0;
        if(ends[8]>=biggest12486){
          biggest12486=ends[8];
        }
        if(ends[9]>=biggest12486){
          biggest12486=ends[9];
        }
        if(ends[10]>=biggest12486){
          biggest12486=ends[10];
        }
        if(ends[11]>=biggest12486){
          biggest12486=ends[11];
        }
        if(ends[12]>=biggest12486){
          biggest12486=ends[12];
        }
        if(ends[13]>=biggest12486){
          biggest12486=ends[13];
        }
        if(biggest12486 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest12486 == 0){
          S11463=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread12478(int [] tdone, int [] ends){
        switch(S11413){
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

  public void thread12477(int [] tdone, int [] ends){
        switch(S11351){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11305){
          case 0 : 
            if(empty.getprestatus()){//sysj\plantCapLoader.sysj line: 70, column: 10
              S11305=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S11287){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plantCapLoader.sysj line: 72, column: 13
                    S11287=1;
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
                    S11287=2;
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
                    S11287=0;
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
              S11305=0;
              S11287=0;
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

  public void thread12476(int [] tdone, int [] ends){
        switch(S11283){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S11253){
          case 0 : 
            switch(S11248){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plantCapLoader.sysj line: 50, column: 12
                  S11248=1;
                  if(armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plantCapLoader.sysj line: 54, column: 7
                    S11253=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S11253=1;
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
                S11253=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                    S11248=0;
                    WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S11253=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S11253=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S11253=1;
            S11253=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
                S11248=0;
                WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S11253=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S11253=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12475(int [] tdone, int [] ends){
        switch(S11239){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S11193){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 34, column: 10
              S11193=1;
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
              S11193=2;
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
              S11193=3;
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
              S11193=0;
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

  public void thread12474(int [] tdone, int [] ends){
        switch(S11186){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S11140){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plantCapLoader.sysj line: 21, column: 10
              S11140=1;
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
              S11140=2;
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
              S11140=3;
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
              S11140=0;
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

  public void thread12471(int [] tdone, int [] ends){
        S11461=1;
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

  public void thread12470(int [] tdone, int [] ends){
        S11453=1;
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

  public void thread12469(int [] tdone, int [] ends){
        S11445=1;
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

  public void thread12468(int [] tdone, int [] ends){
        S11437=1;
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

  public void thread12467(int [] tdone, int [] ends){
        S11429=1;
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

  public void thread12466(int [] tdone, int [] ends){
        S11421=1;
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

  public void thread12465(int [] tdone, int [] ends){
        S11463=1;
    thread12466(tdone,ends);
    thread12467(tdone,ends);
    thread12468(tdone,ends);
    thread12469(tdone,ends);
    thread12470(tdone,ends);
    thread12471(tdone,ends);
    int biggest12472 = 0;
    if(ends[8]>=biggest12472){
      biggest12472=ends[8];
    }
    if(ends[9]>=biggest12472){
      biggest12472=ends[9];
    }
    if(ends[10]>=biggest12472){
      biggest12472=ends[10];
    }
    if(ends[11]>=biggest12472){
      biggest12472=ends[11];
    }
    if(ends[12]>=biggest12472){
      biggest12472=ends[12];
    }
    if(ends[13]>=biggest12472){
      biggest12472=ends[13];
    }
    if(biggest12472 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread12464(int [] tdone, int [] ends){
        S11413=1;
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

  public void thread12463(int [] tdone, int [] ends){
        S11351=1;
    S11305=0;
    S11287=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread12462(int [] tdone, int [] ends){
        S11283=1;
    S11253=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plantCapLoader.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plantCapLoader.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\plantCapLoader.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plantCapLoader.sysj line: 49, column: 6
        S11248=0;
        WPgripped.setPresent();//sysj\plantCapLoader.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S11253=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S11253=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread12461(int [] tdone, int [] ends){
        S11239=1;
    S11193=0;
    pusherRetracted.setPresent();//sysj\plantCapLoader.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread12460(int [] tdone, int [] ends){
        S11186=1;
    S11140=0;
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
      switch(S12458){
        case 0 : 
          S12458=0;
          break RUN;
        
        case 1 : 
          S12458=2;
          S12458=2;
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
          thread12460(tdone,ends);
          thread12461(tdone,ends);
          thread12462(tdone,ends);
          thread12463(tdone,ends);
          thread12464(tdone,ends);
          thread12465(tdone,ends);
          int biggest12473 = 0;
          if(ends[2]>=biggest12473){
            biggest12473=ends[2];
          }
          if(ends[3]>=biggest12473){
            biggest12473=ends[3];
          }
          if(ends[4]>=biggest12473){
            biggest12473=ends[4];
          }
          if(ends[5]>=biggest12473){
            biggest12473=ends[5];
          }
          if(ends[6]>=biggest12473){
            biggest12473=ends[6];
          }
          if(ends[7]>=biggest12473){
            biggest12473=ends[7];
          }
          if(biggest12473 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plantCapLoader.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plantCapLoader.sysj line: 17, column: 2
          thread12474(tdone,ends);
          thread12475(tdone,ends);
          thread12476(tdone,ends);
          thread12477(tdone,ends);
          thread12478(tdone,ends);
          thread12479(tdone,ends);
          int biggest12487 = 0;
          if(ends[2]>=biggest12487){
            biggest12487=ends[2];
          }
          if(ends[3]>=biggest12487){
            biggest12487=ends[3];
          }
          if(ends[4]>=biggest12487){
            biggest12487=ends[4];
          }
          if(ends[5]>=biggest12487){
            biggest12487=ends[5];
          }
          if(ends[6]>=biggest12487){
            biggest12487=ends[6];
          }
          if(ends[7]>=biggest12487){
            biggest12487=ends[7];
          }
          if(biggest12487 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12487 == 0){
            S12458=0;
            active[1]=0;
            ends[1]=0;
            S12458=0;
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
