package mps.sales.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_PaymentMethod extends EnumerationDescriptorBase {

  public EnumerationDescriptor_PaymentMethod() {
    super(0xd2c82ff21fca47a9L, 0x9cebb491a324c870L, 0x74c6770040fc317fL, "PaymentMethod", "r:1553ae46-2a2d-4948-9a23-2cea3299b2f3(mps.sales.structure)/8414543796762325375");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_CASH_0 = new EnumerationDescriptor.MemberDescriptor("CASH", "CASH", 0x74c6770040fc3180L, "r:1553ae46-2a2d-4948-9a23-2cea3299b2f3(mps.sales.structure)/8414543796762325376");
  private final EnumerationDescriptor.MemberDescriptor myMember_CREDIT_0 = new EnumerationDescriptor.MemberDescriptor("CREDIT", "CREDIT", 0x74c6770040fc3185L, "r:1553ae46-2a2d-4948-9a23-2cea3299b2f3(mps.sales.structure)/8414543796762325381");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0xd2c82ff21fca47a9L, 0x9cebb491a324c870L, 0x74c6770040fc317fL, 0x74c6770040fc3180L, 0x74c6770040fc3185L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_CASH_0, myMember_CREDIT_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "CASH":
        return myMember_CASH_0;
      case "CREDIT":
        return myMember_CREDIT_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
