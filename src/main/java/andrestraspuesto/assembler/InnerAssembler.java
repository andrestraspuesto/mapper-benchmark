package andrestraspuesto.assembler;

import andrestraspuesto.pojos.*;

public class InnerAssembler {

  public static DstInner srcToDst(SrcInner src){
    DstInner dst = new DstInner();
    dst.setId(src.getId());
    dst.setF1(src.getF1());
    dst.setF2(src.getF2());
    return dst;
  }

}
