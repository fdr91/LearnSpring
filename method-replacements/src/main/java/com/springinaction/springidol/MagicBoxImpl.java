package com.springinaction.springidol;

/**
 * Created by Fedor on 10/2/2016.
 */
public class MagicBoxImpl implements MagicBox{
    public MagicBoxImpl() {}

    @Override
    public String getContents() {
        return "A beautiful assistant"; // Симпатичная ассистентка в ящике
    }
}
