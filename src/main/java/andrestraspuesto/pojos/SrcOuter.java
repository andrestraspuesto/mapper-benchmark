package andrestraspuesto.pojos;

public class SrcOuter {

  private Integer id;

  private String f1;

  private Double f2;

  private SrcInner inner;

  public Integer getId(){return id;}
  public void setId(Integer id){this.id = id;}
  public String getF1(){return f1;}
  public void setF1(String f1){this.f1 = f1;}
  public Double getF2(){return f2;}
  public void setF2(Double f2){this.f2 = f2;}
  public SrcInner getInner(){return inner;}
  public void setInner(SrcInner inner){this.inner = inner;}
}
