/*
 * This file is part of EntityAPI.
 *
 * EntityAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EntityAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EntityAPI.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.entityapi.nbt.vanilla;

import org.entityapi.api.reflection.ClassTemplate;
import org.entityapi.api.reflection.NMSClassTemplate;
import org.entityapi.api.reflection.refs.NBTBaseRef;
import org.entityapi.nbt.*;

import java.util.List;
import java.util.Map;

public class Converter {

    private enum TagType {
        TAG_BYTE(NMSClassTemplate.create("NBTTagByte"), NBTTagByte.class, byte.class),
        TAG_BYTE_ARRAY(NMSClassTemplate.create("NBTTagByteArray"), NBTTagByteArray.class, byte[].class),
        TAG_COMPOUND(NMSClassTemplate.create("NBTTagCompound"), NBTTagCompound.class, Map.class),
        TAG_DOUBLE(NMSClassTemplate.create("NBTTagDouble"), NBTTagDouble.class, double.class),
        TAG_END(NMSClassTemplate.create("NBTTagEnd"), NBTTagEnd.class, null),
        TAG_FLOAT(NMSClassTemplate.create("NBTTagFloat"), NBTTagFloat.class, float.class),
        TAG_INT(NMSClassTemplate.create("NBTTagInt"), NBTTagInt.class, int.class),
        TAG_INT_ARRAY(NMSClassTemplate.create("NBTTagIntArray"), NBTTagIntArray.class, int[].class),
        TAG_LIST(NMSClassTemplate.create("NBTTagList"), NBTTagList.class, List.class),
        TAG_LONG(NMSClassTemplate.create("NBTTagLong"), NBTTagLong.class, long.class),
        TAG_SHORT(NMSClassTemplate.create("NBTTagShort"), NBTTagShort.class, short.class),
        TAG_STRING(NMSClassTemplate.create("NBTTagString"), NBTTagString.class, String.class);

        private ClassTemplate nmsClass;
        private Class<? extends NBTBase> tagClass;
        private Class<?> storageType;

        private TagType(ClassTemplate nmsClass, Class<? extends NBTBase> tagClass, Class<?> storageType) {
            this.nmsClass = nmsClass;
            this.tagClass = tagClass;
            this.storageType = storageType;
        }

        public ClassTemplate getNMSClass() {
            return this.nmsClass;
        }

        public Class<? extends NBTBase> getTagClass() {
            return this.tagClass;
        }

        public Class<?> getStorageType() {
            return this.storageType;
        }
    }

    public static AbstractNBTTag convert(NBTBase base) {
        Object vannilaTag = NBTBaseRef.CREATE_TAG_BY_ID.invoke(null, base.getTypeId());

        return null;
    }
}