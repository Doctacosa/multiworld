/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiworld.flags;

import java.util.EnumMap;
import multiworld.api.flag.FlagName;

/**
 *
 * @author Fernando
 */
public class FlagMap extends EnumMap<FlagName,FlagValue>
{
	private static final long serialVersionUID = 1L;
	public FlagMap()
	{
		super(FlagName.class);
	}
}
