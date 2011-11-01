﻿﻿/*
 * Copyright (C) 2011 mooege project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

using System.Collections.Generic;
using Mooege.Common.MPQ.FileFormats.Types;
using Mooege.Core.GS.Map;

namespace Mooege.Core.GS.Actors
{
    public class Environment : Actor
    {
        public override ActorType ActorType { get { return ActorType.Enviroment; } }

        public Environment(World world, int actorSNO, Dictionary<int, TagMapEntry> tags)
            : base(world, tags)
        {
            this.SNOId = actorSNO;
            this.Field2 = 16;
            this.Field3 = 0x0;
            this.Field7 = 0x00000001;
            this.Field8 = this.SNOId;
        }
    }
}
