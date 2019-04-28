import { RouterModule } from '@angular/router';

import { MainPageComponent} from './main-page/main-page.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';

export const appRoutes = [

    {
        path: '',
        redirectTo: 'welcome',
        pathMatch: 'full'
    },
    {
        path: 'welcome',
        component: WelcomePageComponent
    },
    {
        path: 'main',
        component: MainPageComponent
    },
    {
        path: '**',
        component: WelcomePageComponent
    }
];
