package com.hanbit.calculator.service;

import com.hanbit.calculator.domain.CalcDTO;

/**
 * Created by hb2011 on 2016-12-10.
 */

public interface CalcService {
    public abstract int plus(CalcDTO param);
    public int minus(CalcDTO param);
    public int multi(CalcDTO param);
    public int divid(CalcDTO param);

}
