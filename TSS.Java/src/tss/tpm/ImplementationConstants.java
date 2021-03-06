package tss.tpm;

import tss.*;
import java.util.*;

// -----------This is an auto-generated file: do not edit

//>>>
/**
* Architecturally defined constants
*/
public final class ImplementationConstants extends TpmEnum<ImplementationConstants>
{
    // Values from enum _N are only intended to be used in case labels of a switch statement using the result of this.asEnum() method as the switch condition.
    // However, their Java names are identical to those of the constants defined in this class further below,
    // so for any other usage just prepend them with the ImplementationConstants. qualifier.
    public enum _N {
        Ossl,
        
        Ltc,
        
        Msbn,
        
        Symcrypt,
        
        HASH_COUNT,
        
        MAX_SYM_KEY_BITS,
        
        MAX_SYM_KEY_BYTES,
        
        MAX_SYM_BLOCK_SIZE,
        
        MAX_CAP_CC,
        
        MAX_RSA_KEY_BYTES,
        
        MAX_AES_KEY_BYTES,
        
        MAX_ECC_KEY_BYTES,
        
        LABEL_MAX_BUFFER,
        
        _TPM_CAP_SIZE,
        
        MAX_CAP_DATA,
        
        MAX_CAP_ALGS,
        
        MAX_CAP_HANDLES,
        
        MAX_TPM_PROPERTIES,
        
        MAX_PCR_PROPERTIES,
        
        MAX_ECC_CURVES,
        
        MAX_TAGGED_POLICIES,
        
        MAX_AC_CAPABILITIES,
        
        MAX_ACT_DATA
        
    }
    
    private static ValueMap<ImplementationConstants> _ValueMap = new ValueMap<ImplementationConstants>();
    
    public static final ImplementationConstants
    
        // These definitions provide mapping of the Java names of constants to their TPM values.
        Ossl = new ImplementationConstants(1, _N.Ossl),
        Ltc = new ImplementationConstants(2, _N.Ltc),
        Msbn = new ImplementationConstants(3, _N.Msbn),
        Symcrypt = new ImplementationConstants(4, _N.Symcrypt),
        HASH_COUNT = new ImplementationConstants(3, _N.HASH_COUNT),
        MAX_SYM_KEY_BITS = new ImplementationConstants(256, _N.MAX_SYM_KEY_BITS),
        MAX_SYM_KEY_BYTES = new ImplementationConstants(((ImplementationConstants.MAX_SYM_KEY_BITS.toInt() + 7) / 8), _N.MAX_SYM_KEY_BYTES),
        MAX_SYM_BLOCK_SIZE = new ImplementationConstants(16, _N.MAX_SYM_BLOCK_SIZE),
        MAX_CAP_CC = new ImplementationConstants(TPM_CC.LAST.toInt(), _N.MAX_CAP_CC),
        MAX_RSA_KEY_BYTES = new ImplementationConstants(256, _N.MAX_RSA_KEY_BYTES),
        MAX_AES_KEY_BYTES = new ImplementationConstants(32, _N.MAX_AES_KEY_BYTES),
        MAX_ECC_KEY_BYTES = new ImplementationConstants(48, _N.MAX_ECC_KEY_BYTES),
        LABEL_MAX_BUFFER = new ImplementationConstants(32, _N.LABEL_MAX_BUFFER),
        _TPM_CAP_SIZE = new ImplementationConstants(4, _N._TPM_CAP_SIZE),
        MAX_CAP_DATA = new ImplementationConstants(1016, _N.MAX_CAP_DATA),
        MAX_CAP_ALGS = new ImplementationConstants(169, _N.MAX_CAP_ALGS),
        MAX_CAP_HANDLES = new ImplementationConstants(254, _N.MAX_CAP_HANDLES),
        MAX_TPM_PROPERTIES = new ImplementationConstants(127, _N.MAX_TPM_PROPERTIES),
        MAX_PCR_PROPERTIES = new ImplementationConstants(203, _N.MAX_PCR_PROPERTIES),
        MAX_ECC_CURVES = new ImplementationConstants(508, _N.MAX_ECC_CURVES),
        MAX_TAGGED_POLICIES = new ImplementationConstants(14, _N.MAX_TAGGED_POLICIES),
        MAX_AC_CAPABILITIES = new ImplementationConstants(127, _N.MAX_AC_CAPABILITIES),
        MAX_ACT_DATA = new ImplementationConstants(84, _N.MAX_ACT_DATA);
    public ImplementationConstants (int value) { super(value, _ValueMap); }
    
    public static ImplementationConstants fromInt (int value) { return TpmEnum.fromInt(value, _ValueMap, ImplementationConstants.class); }
    
    public static ImplementationConstants fromTpm (byte[] buf) { return TpmEnum.fromTpm(buf, _ValueMap, ImplementationConstants.class); }
    
    public static ImplementationConstants fromTpm (InByteBuf buf) { return TpmEnum.fromTpm(buf, _ValueMap, ImplementationConstants.class); }
    
    public ImplementationConstants._N asEnum() { return (ImplementationConstants._N)NameAsEnum; }
    
    public static Collection<ImplementationConstants> values() { return _ValueMap.values(); }
    
    private ImplementationConstants (int value, _N nameAsEnum) { super(value, nameAsEnum, _ValueMap); }
    
    private ImplementationConstants (int value, _N nameAsEnum, boolean noConvFromInt) { super(value, nameAsEnum, null); }
    
    @Override
    protected int wireSize() { return 4; }
}

//<<<

