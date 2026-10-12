import React from 'react';

function Text({
  as: Component = 'p',
    children,
      className = '',
        ...restProps
        }) {
          // Combine base class, modifier class, and any custom classes
            const classes = `text text--${Component} ${className}`.trim();

              return (
                  <Component className={classes} {...restProps}>
                        {children}
                            </Component>
                              );
                              }

                              export default Text;