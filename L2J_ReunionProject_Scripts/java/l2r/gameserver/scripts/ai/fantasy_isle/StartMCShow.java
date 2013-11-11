/*
 * Copyright (C) 2004-2013 L2J DataPack
 * 
 * This file is part of L2J DataPack.
 * 
 * L2J DataPack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J DataPack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package l2r.gameserver.scripts.ai.fantasy_isle;

import l2r.gameserver.instancemanager.QuestManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Start MC Show.
 */
public class StartMCShow implements Runnable
{
	public static final Logger _log = LoggerFactory.getLogger(StartMCShow.class);
	
	@Override
	public void run()
	{
		try
		{
			QuestManager.getInstance().getQuest("MC_Show").notifyEvent("Start", null, null);
		}
		catch (Exception e)
		{
			_log.warn("Logger: notifyEvent failed (StartMcShow) Report this to team. ");
		}
	}
}
