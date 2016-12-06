package andrestraspuesto.assembler;

import andrestraspuesto.pojos.*;

public class OuterAssembler {

  public static DstOuter srcToDst(SrcOuter src){
    DstOuter dst = new DstOuter();
    dst.setId(src.getId());
    dst.setF1(src.getF1());
    dst.setF2(src.getF2());
    dst.setInner(InnerAssembler.srcToDst(src.getInner()));
    return dst;
  }

}
