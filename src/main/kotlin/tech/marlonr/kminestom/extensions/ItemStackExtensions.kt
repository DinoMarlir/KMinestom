package tech.marlonr.kminestom.extensions

import net.minestom.server.item.ItemStack
import net.minestom.server.item.Material

inline fun itemStack(material: Material, builder: ItemStack.Builder.() -> Unit) = ItemStack.builder(material).apply(builder)