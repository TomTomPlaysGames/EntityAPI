package io.snw.entityapi.nbt;

import io.snw.entityapi.nbt.exception.NBTReadException;
import io.snw.entityapi.nbt.exception.NBTWriteException;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NBTTagByte extends NBTNumber<Byte> {

    private byte data;

    public NBTTagByte() {}

    public NBTTagByte(byte b) {
        this.data = b;
    }

    @Override
    public byte getTypeId() {
        return 1;
    }

    @Override
    public Byte getValue() {
        return this.data;
    }

    @Override
    public String toString() {
        return "" + this.data + "b";
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            NBTTagByte nbttagbyte = (NBTTagByte) object;

            return this.data == nbttagbyte.data;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data;
    }

    @Override
    void write(DataOutput dataoutput) {
        try {
            dataoutput.writeByte(this.data);
        } catch (IOException e) {
            throw new NBTWriteException(e);
        }
    }

    @Override
    void load(DataInput datainput, int depth) {
        try {
            this.data = datainput.readByte();
        } catch (IOException e) {
            throw new NBTReadException(e);
        }
    }

    @Override
    public NBTBase clone() {
        return new NBTTagByte(this.data);
    }
}
