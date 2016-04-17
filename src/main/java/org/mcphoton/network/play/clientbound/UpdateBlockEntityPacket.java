/*
* Copyright (c) 2016 MCPhoton <http://mcphoton.org> and contributors.
*
* This file is part of the Photon API <https://github.com/mcphoton/Photon-API>.
*
* The Photon API is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* The Photon API is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package org.mcphoton.network.play.clientbound;

import org.mcphoton.block.BlockEntity;
import org.mcphoton.network.Packet;
import org.mcphoton.network.ProtocolHelper;
import org.mcphoton.network.ProtocolOutputStream;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/**
 * @author Maaattt
 */
public class UpdateBlockEntityPacket implements Packet {

    public int x,y,z;
    public int action;
    public BlockEntity blockEntity;

    @Override
    public int getId() { return 0x08; }

    @Override
    public boolean isServerBound() { return false; }

    @Override
    public void writeTo(ProtocolOutputStream out) {
        out.writeLong(ProtocolHelper.encodePosition(x,y,z));
        out.writeByte(action);
        try
        {
            blockEntity.writeTo(out);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Packet readFrom(ByteBuffer buff) {
        long pos = buff.getLong();
        x = ProtocolHelper.decodePositionX(pos);
        y = ProtocolHelper.decodePositionY(pos);
        z = ProtocolHelper.decodePositionZ(pos);
        action = ProtocolHelper.readUnsignedByte(buff.get());
        //TODO Read NBT
        return this;
    }

    @Override
    public String toString() {
        return "UpdateBlockEntityPacket{" + "x=" + x + ", y=" + y + ", z=" + z + ", action=" + action + '}';
    }
}
