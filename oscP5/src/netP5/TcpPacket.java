/**
 * A network library for processing which supports UDP, TCP and Multicast.
 *
 * (c) 2006-2010
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author		Andreas Schlegel http://www.sojamo.de/libraries/oscP5
 * @modified	08/22/2011
 * @version		0.9.6
 */

package netP5;

/**
 * @invisible
 */
public class TcpPacket {

  private final TcpClient _myTcpClient;

  private final StringBuffer _myStringBuffer;

  private final byte[] _myData;

  public TcpPacket(final TcpClient theTcpClient,
                   final StringBuffer theBuffer,
                   final byte[] theBytes) {
    _myStringBuffer = theBuffer;
    _myTcpClient = theTcpClient;
    _myData = theBytes;
  }


  public TcpClient getTcpConnection() {
    return _myTcpClient;
  }


  public String getString() {
    return _myStringBuffer.toString();
  }


  public StringBuffer getStringBuffer() {
    return _myStringBuffer;
  }


  public byte[] getData() {
    return _myData;
  }

}
