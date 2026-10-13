import React from "react";

const InputWithLabel = React.forwardRef(function InputWithLabel(
    { label, ...props },
            ref
                    ) { return (
                                        <div>  {label && <label>{label}</label>}
                                                                                    <input ref={ref} {...props} />
                                                                                                                                        </div>);});
                                                                                                                                                                                                export default InputWithLabel;