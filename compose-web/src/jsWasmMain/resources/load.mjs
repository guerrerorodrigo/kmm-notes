import { instantiate } from './AppName.uninstantiated.mjs';

await wasmSetup;
instantiate({ skia: Module['asm'] });