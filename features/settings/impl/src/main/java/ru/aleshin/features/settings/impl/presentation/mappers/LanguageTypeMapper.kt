/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * imitations under the License.
 */
package ru.aleshin.features.settings.impl.presentation.mappers

import androidx.compose.runtime.Composable
import ru.aleshin.features.settings.api.domain.entities.LanguageType
import ru.aleshin.features.settings.impl.presentation.theme.SettingsThemeRes

/**
 * @author Stanislav Aleshin on 21.03.2023.
 */
@Composable
fun LanguageType.toLanguageName(): String = when (this) {
    LanguageType.DEFAULT -> SettingsThemeRes.strings.defaultLanguageTitle
    LanguageType.EN -> SettingsThemeRes.strings.engLanguageTitle
    LanguageType.RU -> SettingsThemeRes.strings.rusLanguageTitle
    LanguageType.DE -> SettingsThemeRes.strings.gerLanguageTitle
    LanguageType.ES -> SettingsThemeRes.strings.spaLanguageTitle
    LanguageType.FA -> SettingsThemeRes.strings.perLanguageTitle
}
